<%-- 
    Document   : Administrador
    Created on : 29-may-2019, 9:18:32
    Author     : cice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="administrador">
            <h2>REGISTRO ADMINISTRADOR</h2>
        <form method="POST" class="formulario">
            Usuario:<input type="text" name="usuario" placeholder="Usuario">
            Contraseña:<input type="password" name="password" placeholder="Contraseña">
            <input type="submit"  id="boton" name="registrar" value="Registrar">
        </form>
        </div>
    </body>
</html>
