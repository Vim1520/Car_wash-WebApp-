<html>
    <head><title>User Login</title>
    </head>
    <style>
  input[type=button],input[type=submit] {
  padding: 1px 2px;
  border: none;
  cursor: pointer;
  width: 100%;
}
input[type=text], input[type=password] {
  width: 100%;
  padding: 1px 1px;
  margin: 1px 1px;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

    </style>
    <body bgcolor="">
      <h1><center>User Login</center></h1><br>
      <table border="10px" align="center">
          <center>
          <form name="loginForm" method="POST" action="Ulogin">
             <tr> 
              <td><p>User name:
              </td>
                  <td>
                   <input type="text" name="uname" size="20"/></p>
                  </td>
             </tr>
             <tr>
             <td> <p>Password: </td> <td><input type="password" name="password" size="20"/></p></td>
          </tr>
          <tr>
              <td colspan="2">
              <p>  <input type="submit" value="Login"/></p></td>
          </tr>
          <tr align="center" >
            <td>
            <a href="register.jsp">Sign UP?</a></td>
          </tr>
          </form>       
      </center>
      </table>
     </body>
  </html>