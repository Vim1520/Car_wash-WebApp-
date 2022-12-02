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

public class searchplaces extends HttpServlet{
    static Connection con=null;
    static String place;
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
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();   
    connection();
    String query="SELECT service from serviceplace where place=?";
    smt=con.prepareStatement(query);
    smt.setString(1, place);			
    ResultSet resultset=smt.executeQuery();
    int j=0;
    while(resultset.next()) {
        j=1;
        out.print("<html><body><center><h2>the Available Services are</h2><TABLE ><TR>");
        out.print("<TH>___Service___</TH>");
        out.print("</TR>    <TR>");
        out.print(" <TD> "+resultset.getString(1)+" </td>");
        out.print("</td> </TR></TABLE></center></BODY></HTML>");
    }
    if(j==0) {
        out.print("<html><body><center><h1>-----Invalid Place-----</h1></center></body></html>");
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