<html>
    <head><title>Book</title>
    </head>
    <style>
    </style>
    <body>
      <h1><center>Book</center></h1><br>
      <table border="10px" border-color="red" align="center">
          <center>
          <form action="book" method="POST" >
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
                <td><p>Place:
                </td>
                    <td>
                        <input type="text" name="place">
                    </td>
               </tr>
               <tr>
                <td> <p>Service: 
                </td> <td>
                    <select name="service">
                    <option> </option>
                    <option value="Water wash">Water wash</option>
                    <option value="General Service">General Service</option>
                    <option value="Complete service with water wash">Complete service with water wash</option>
                </select></td>
             </tr>
             <tr>
             <td> <p>Date: 
             </td> <td><input type="date" name="date" value="enter in dd/mm/yyy"/></p></td>
          </tr>
          <tr align="center">
              <td colspan="2">
              <p>  <input type="submit" value="Book"/></p></td>
          </tr>
          </form>       
      </center>
      </table>
     </body>
  </html>