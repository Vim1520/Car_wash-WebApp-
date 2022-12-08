<html>
    <style>
        button{
            cursor: pointer;
      border: 10;
      border-radius: 4px;
      font-weight: 550;
      margin: auto;
      width: 70px;
      padding: 6px 0;
      box-shadow: 0 0 20px rgba(104, 85, 224, 0.2);
      transition: 0.4s;
        }
        .btn {
      color: rgb(104, 85, 224);
      background-color: rgba(255, 255, 255, 1);
      border: 1px solid rgba(104, 85, 224, 1);
}
    </style>
    <title>
        Admin Menu
    </title>
    <body>
       <h1><center><b>Menu</b></center></h1>
       <table align="center" style="width: 300px; height:200px;" >
        <tr>
            <td >
                1. Add Places and Services
            </td>
            <td>
            <center>  <button class="btn" onClick="location.href='Addplaces.jsp'">Add Place</button></center>
            </td>
        </tr>
        <tr>
            <td>
                2. View Bookings   
            </td>
            <td><table style="width:auto; height:120%;">
                <tr>
                    <td>
                        <form action="view">
                            <button class="btn" onClick="Submit">view</button>
                            
                        </form> 

                    </td>
                </tr>
            </table>
            </td>
        </tr>
        <tr>
            <td >
                3. Update Status           
            </td>
            <td>
             <center>   <button class="btn" onClick="location.href='update.jsp'">Update</button></center>
                
            </td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="button" value="LogOut" onclick="location.href='index.jsp'">
            </td>
        </tr>
       </table>
    </body>
</html>