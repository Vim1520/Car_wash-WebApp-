<%@ page language="java" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page import=" java.io.IOException"%>
<%@ page import=" java.sql.*"%>
<% Class.forName("com.mysql.cj.jdbc.Driver");%>
<HTML>
       <HEAD>
       <TITLE> Bookings </TITLE>
       </HEAD><body>
<% 
%>


 <center><H1> Bookings Pending </H1>
 <%
      Connection connection=null;
      ResultSet resultset;
      connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/car_wash","root","2002"); 
      Statement stmt = connection.createStatement() ;
      PreparedStatement statement=null;
      statement = connection.prepareStatement(" SELECT * from stab where status=? ");
      statement.setString(1, "pending");
      resultset = statement.executeQuery();
      int j=0;
%>
      <TABLE BORDER="2" cellpadding="8" cellspacing="6">
      <TR>
      <TH>Name</TH>
      <TH>Place Name</TH>
      <TH>Date</TH>
      <TH>service</TH>
      <TH>Status</TH>
      </TR>
      <% while(resultset.next()){j++; %>
      <TR>
       <TD> <%= resultset.getString(2) %></td>
       <TD> <%= resultset.getString(3) %></TD>
       <TD> <%= resultset.getString(4) %></TD>
       <TD> <%= resultset.getString(5) %></TD>
       <TD> <%= resultset.getString(6) %></TD>
       <TD> <form action="stsup" method="POST"><input type="hidden" name="id" value=<%=resultset.getString(1)%>><input type="submit" value="Accept" name="sts"></form></td></TD>
       <TD> <form action="stsup" method="POST"><input type="hidden" name="id" value=<%=resultset.getString(1)%>><input type="submit" value="Reject" name="sts"></form></td></TD>
      </TR>
      <% }
            if(j==0){%>
              <TD colspan="5"> <center><h2>No Bookings Pending</h2></center></TD>
           <% }
      %></center>
     </TABLE>
 <form action="Admin.jsp"><h1><center>Go Back</center>
 </h1><center>To Go Back !!!!!<table><tr><td><input type="submit" value="__"></td
</tr></center></table></form>
     </BODY>
</HTML>