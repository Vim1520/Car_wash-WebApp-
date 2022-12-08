<html>
    <head><title>Register</title>
    </head>
    <style>
    </style>
    <body>
      <h1><center>Sign UP</center></h1><br>
      <table border="10px" border-color="red" align="center">
          <center>
          <form name="register" method="POST" action="newDet">
            <input type="hidden" name="role" value="User">
             <tr> 
              <td><p>Name:
              </td>
                  <td>
                   <input type="text" name="name" size="20"/></p>
                  </td>
             </tr>
             <tr> 
                <td><p>Mobile number:
                </td>
                    <td>
                     <input type="text" name="Mobile" size="20"/></p>
                    </td>
               </tr>
               <tr> 
                <td><p>Address:
                </td>
                    <td>
                        <textarea name="address" rows="3" cols="20">
                    </textarea>
                    </td>
               </tr>
               <tr>
                <td> <p>Set a username: 
                </td> <td><input type="text" name="uname" size="20"/></p></td>
             </tr>
             <tr>
             <td> <p>Set a Password: 
             </td> <td><input type="password" name="password" size="20"/></p></td>
          </tr>
          <tr align="center">
              <td colspan="2">
              <p>  <input type="submit" value="Register"/></p></td>
          </tr>
          </form>       
      </center>
      </table>
     </body>
  </html>