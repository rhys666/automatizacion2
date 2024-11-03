<!-- welcome.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
</head>
<body>
    <h1>Welcome, 
        <%
            // Cambié el nombre de la variable a userSession para evitar conflictos
            HttpSession userSession = request.getSession(false); 
            String username = null;

            if (userSession != null) {
                username = (String) userSession.getAttribute("username"); // Obtener el nombre de usuario de la sesión
            }
        %>
        <%= (username != null) ? username : "Guest" %>!</h1> <!-- Mostrar username o "Guest" si no hay sesión -->
    <p>You have successfully logged in.</p>

    <!-- Logout button -->
    <form action="logout" method="post">
        <button type="submit">Logout</button>
    </form>
</body>


</html>