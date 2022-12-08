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


public class stsup extends HttpServlet{
    
	static String sts;
    static String id;
	
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
		sts=req.getParameter("sts");
        id=req.getParameter("id");
        System.out.println("id= "+id+" "+"sts= "+sts);
        PreparedStatement smt=null;
		String query;
		try{
		connection();
		query="Update stab set status = ? where ID= ? ";
		smt=con.prepareStatement(query);
		smt.setString(1, (sts.equals("Accept"))?"Accepted":"Rejected");
		smt.setString(2, id); 
		int cnt = smt.executeUpdate();
        if(cnt==0) {
            
            out.print("<form action=\"Admin.jsp\" method=\"post\"><h1><center>Go Back</center>");
            out.print("</h1><center>Error while Updating !!!<table><tr><td><input type=\"submit\" value=\"__\"></td>");
            out.print("</tr></center></table></form>");

        }
        else {
           
            out.print("<form action=\"Admin.jsp\" method=\"post\"><h1><center>Go Back</center>");
            out.print("</h1><center>Successfuly Status Updated !!!<table><tr><td><input type=\"submit\" value=\"__\"></td>");
            out.print("</tr></center></table></form>");
        }
	    }
		catch(Exception e){
			System.out.println(e);
		}
}
   
}
