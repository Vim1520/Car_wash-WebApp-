import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.util.*;


public class add extends HttpServlet{
    
	static String place;
	static String service;
	
    static Connection con;
    public static void connection()  {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/car_wash","root","2002");
             
       } catch (Exception e) {
           System.out.println(e);
       }
  }



    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException , IOException{

        res.setContentType("text/html");
		PrintWriter out = res.getWriter();
        HttpSession s=req.getSession();
		place=req.getParameter("place");
        service=req.getParameter("service");
        PreparedStatement smt=null;
		String query;
		try{
		connection();
		query="INSERT INTO SERVICEPLACE(place,service) VALUES(?,?)";
		smt=con.prepareStatement(query);
		smt.setString(1, service);
		smt.setString(2, place); 
		int cnt = smt.executeUpdate();
        if(cnt==0) {
            
            out.print("<form action=\"Add.jsp\" method=\"post\"><h1><center>Go Back</center>");
            out.print("</h1><center>Error While Adding !!!<table><tr><td><input type=\"submit\" value=\"__\"></td>");
            out.print("</tr></center></table></form>");

        }
        else {
           
            out.print("<form action=\"Admin.jsp\" method=\"post\"><h1><center>Go Back</center>");
            out.print("</h1><center>Successfuly Addedu !!!<table><tr><td><input type=\"submit\" value=\"__\"></td>");
            out.print("</tr></center></table></form>");
        }
	    }
		catch(Exception e){
			System.out.println(e);
		}
}
   
}
