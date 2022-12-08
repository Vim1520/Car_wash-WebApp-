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

public class view extends HttpServlet{
    static Connection con;
    static String id;
    public static void connection()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/car_wash","root","2002");
             
       } catch (Exception e) {
           System.out.println(e);
       }
  }
  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException , IOException{
    
            
            try{
            connection();
            Statement smt=con.createStatement();
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();   
            HttpSession s=req.getSession();
			connection();
			String query="select * from stab;";
			ResultSet resultset=smt.executeQuery(query);
			int j=0;
            out.print("<html><body><center><h2>Details</h2><TABLE border =\"4\" cellpadding =\"4\" cellspacing=\"4\"><TR>");
            out.print("<TH>Name</TH>");
            out.print("<TH>Place Name</TH>");
            out.print("<TH>Date</TH>");
            out.print("<TH>service</TH>");
            out.print("<TH>Status</TH>");                
            out.print("</TR>    ");
			while(resultset.next()) {
				j++;
                out.print("<TR> <TD> " +resultset.getString(2)+" </td>");
                out.print(" <TD>" +resultset.getString(3) +"</td>");
                out.print(" <TD> "+ resultset.getString(4)+" </td>");
                out.print(" <TD> "+resultset.getString(5) +"</td>");
                out.print(" <TD> "+ resultset.getString(6) +"</td>");
                
            }
            out.print("</td> </TR></TABLE></center></BODY></HTML>");
			if(j==0) {
				out.print("<html><body><center><h1>-----Invalid-----</h1></center></body></html>");
			}
			out.print("<form action=\"Admin.jsp\" method=\"post\"><h1><center>Go Back</center>");
            out.print("</h1><center>To Go Back to the Main Menu !!!<table><tr><td><input type=\"submit\" value=\"__\"></td>");
		    out.print("</tr></center></table></form>");
		
		}
		catch (Exception e) {
	         System.out.println(e);
        }
  }

}