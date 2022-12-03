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


public class newDet extends HttpServlet{
    
	static String pass;
	static String uname;
	static String Name;												
	static String mobNum;
	static String address;
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
		pass=req.getParameter("password");
        Name=req.getParameter("name");
        uname=req.getParameter("uname");
        address=req.getParameter("address");
        mobNum=req.getParameter("Mobile");
        PreparedStatement smt=null;
		String query;
		try{
		connection();
		query="INSERT INTO  utab (uname,pass,address,phone,name) VALUES(?,?,?,?,?)";
		smt=con.prepareStatement(query);
		smt.setString(1, uname);
		smt.setString(2, pass);
		smt.setString(3, address);
		smt.setString(4, mobNum);
		smt.setString(5, Name);
		int cnt = smt.executeUpdate();
        if(cnt==0) {
            
            out.print("\nNo !!!!");
        }
        else {
           
            out.println("\nDone ");
        }
	    }
		catch(Exception e){
			System.out.println(e);
		}
        out.print("<form action=\"index.jsp\" method=\"post\">");
        out.print("</h1><center>To Login !!!!--- !!!<table><tr><td><input type=\"submit\" value=\"Login\"></td>");
        out.print("</tr></center></table></form>");
}
   
}
