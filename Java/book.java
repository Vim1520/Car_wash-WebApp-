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


public class book extends HttpServlet{
    
	static String place;
	static String service;
	static String name;												
	static String date;
	static String status="pending";
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
		name=req.getParameter("name");
        place=req.getParameter("place");
        date=req.getParameter("date");
        service=req.getParameter("service");
        PreparedStatement smt=null,smt1=null;
		String query,query1;
		try{
		connection();
               // if(cnt1<5){
		query="INSERT INTO  stab (name,place,date,service,status) VALUES(?,?,?,?,?)";
		smt=con.prepareStatement(query);
		smt.setString(1, name);
		smt.setString(2, place);
		smt.setString(3, date);
		smt.setString(4, service);
		smt.setString(5, status);
		int cnt = smt.executeUpdate();
        if(cnt==0) {
            
            out.print(".....");
        }
        else {
           
            out.println("\n<h1>Successfully Booked</h1> ");
        }
        // else{
        //     out.print("<form action=\"User.jsp\" method=\"post\">");
        //     out.print("</h1><center>Sorry, Exceeded the Booking for the day<table><tr><td><input type=\"submit\" value=\"Login\"></td>");
        //     out.print("</tr></center></table></form>");
        // }
    }
		catch(Exception e){
			System.out.println(e);
		}
        out.print("<form action=\"User.jsp\" method=\"post\">");
        out.print("</h1><center>To Main menu---||--||<table><tr><td><input type=\"submit\" value=\"Login\"></td>");
        out.print("</tr></center></table></form>");
    }
    
}
   

