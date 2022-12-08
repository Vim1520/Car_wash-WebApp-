<html>
     <style>
      input[type=button]{
            cursor: pointer;
      border: 10;
      border-radius: 4px;
      font-weight: 550;
      margin: auto;
      width: 70px;
      padding: 6px 0;
      box-shadow: 0 0 20px rgba(104, 85, 224, 0.2);
      transition: 0.4s;
      color: rgb(104, 85, 224);
      background-color: rgba(255, 255, 255, 1);
      border: 1px solid rgba(104, 85, 224, 1);
}
    </style>
    <title>User Menu</title>
    <body>
     <center> <h1>User Menu</h1>
       <form method="post">
        <table align="center" style="width: 300px; height:200px;"  >
            <tr>
                <td>
                    1. Search by Place
                </td>
                <td align="center">
                    <input type="button" value="Search" onclick="location.href='searchplaces.jsp'">
                </td>
            </tr>
            <tr>
                <td>
                    2. Book
                </td>
                <td align="center">
                    <input type="button" value="Book" onclick="location.href='book.jsp'">
                </td>
            </tr>
            <tr>
                <td>
                    3. Get Status
                </td>
                <td align="center">
                     <input type="button" value="get" onclick="location.href='getstatus.jsp'">
                </td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="button" value="LogOut" onclick="location.href='index.jsp'">
                </td>
            </tr>
        </table>
       </form></center>
    </body>
</html>