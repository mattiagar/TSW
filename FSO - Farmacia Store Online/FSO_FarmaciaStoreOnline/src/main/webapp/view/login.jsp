<%--
  Created by IntelliJ IDEA.
  User: mattiagar
  Date: 28/06/23
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="login.css">
    <title>Login</title>
</head>
<div class="start">
    <!-- Logo -->
    <a href="../home/homepage.html">
        <img class="logo" src="../home/logo.jpg" alt="Logo FSO">
    </a>
    <p></p>
</div>

<form class="pagina reveal" action="../controller/loginUtenteServlet" method="post">
    <div class="credenziali">
        <table>
        <div class="input-group mb-3">
            <tr><td><span class="input-group-text">Username</span></td>
            <td><input type="text" name="username" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
        </div></td></tr>
        <div class="input-group mb-3">
            <tr><td><span class="input-group-text">Password</span></td>
                <td><input type="text" name="password" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                </td></tr>
        </div>
            <tr><td><input type="submit" class="button" value="Login"></td></tr>
        </table>
    </div>

</form>


    <footer class="footer">
        <div>
            <h4 class="normal-text tw">Domenico<br>Mattia<br>Garofalo</h4>
            <h5>0512110994</h5>
        </div>
    </footer>

</body>
</html>
