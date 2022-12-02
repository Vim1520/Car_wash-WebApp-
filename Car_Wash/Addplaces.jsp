<html>
    <title>Place and Service</title>
    <body><center>
        <h1>Select Place and Service</h1><br><br>
        <form action="add" method="post">
            <table style="height: 20%;">
                <tr>
                    <td>
                        Add place:
                    </td>
                    <td>
                        <input type="text" name="place">
                    </td>
                </tr>
                <tr>
                    <td>
                        select service type to add:
                    </td>
                    <td>
                        <select name="service">
                            <option> </option>
                            <option value="Water wash">Water wash</option>
                            <option value="General Service">General Service</option>
                            <option value="Complete service with water wash">Complete service with water wash</option>
                        </select>
                    </td>
                </tr>
                <tr><td>

                </td>
                    <td colspan="2">
                        <input type="submit" name="service" value="Add" style="width: 20%;">
                    </td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>