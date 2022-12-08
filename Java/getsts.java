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

public class getsts extends HttpServlet{
    static Connection con=null;
    static String place;
    static String name;
    public static void connection()  {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/car_wash","root","2002");
             
       } catch (Exception e) {
           System.out.println(e);
       }
  }
  protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException , IOException{
    PreparedStatement smt=null;
    try{
    place=req.getParameter("place");
    name=req.getParameter("name");
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();   
    connection();
    String query="SELECT status from stab where name=? AND place=?";
    smt=con.prepareStatement(query);
    smt.setString(1, name);		
    smt.setString(2, place);	
    ResultSet resultset=smt.executeQuery();
    int j=0;
    out.print("<html><body><center><h2>Your Service Status</h2><TABLE border =\"4\" cellpadding =\"4\" cellspacing=\"4\"><TR>");
    out.print("<TH>Status</TH></TR>");
    while(resultset.next()) {
        j=1;
        out.print("  <TR>");
        out.print(" <TD> "+resultset.getString(1)+" </td>");
    }
    out.print("</td> </TR></TABLE></center></BODY></HTML>");
    if(j==0) {
        out.print("<html><body><center><h3>-----No DATA-----</h3></center></body></html>");
    }
    out.print("<form action=\"User.jsp\" method=\"post\"><h1><center>Go Back</center>");
    out.print("</h1><center>To Go Back to the Main Menu !!!<table><tr><td><input type=\"submit\" value=\"__\"></td>");
    out.print("</tr></center></table></form>");

}
catch (Exception e) {
     System.out.println(e);
 }
  }

}