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


public class Alogin extends HttpServlet{
    
	static String pass;
	static String uname;
	
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
        HttpSession s=req.getSession();
		PrintWriter out = res.getWriter();
		pass=req.getParameter("password");
        uname=req.getParameter("uname");
        PreparedStatement smt=null;
		String query;
		try{
		connection();
		query="SELECT * from atab Where user=? And pass=?";
		smt=con.prepareStatement(query);
		smt.setString(1, uname);
		smt.setString(2, pass);
        System.out.println(uname);
        System.out.print(pass);  
		int cnt = 0;
        ResultSet rs=smt.executeQuery();
        while(rs.next()){
            cnt++;
        }
        if(cnt==0) {
            
            req.getRequestDispatcher("/error.jsp").forward(req, res);

        }
        else {
           
            s.setAttribute("uname",uname);
            req.getRequestDispatcher("/Admin.jsp").include(req, res);
        }
	    }
		catch(Exception e){
			System.out.println(e);
		}
}
   
}
