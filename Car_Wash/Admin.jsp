<html>
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
                <input type="button" value="Add Place" onclick="location.href='Addplaces.jsp'">
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
                            <input type="submit" value="View"/>
                        </form> 

                    </td>
                </tr>
            </table>
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