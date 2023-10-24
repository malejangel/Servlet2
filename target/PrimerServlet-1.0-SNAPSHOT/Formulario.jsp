<%-- 
    Document   : Formulario
    Created on : 20/09/2023, 4:44:11 p. m.
    Author     : aleja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style>
        body {
            background-color: red; /* Fondo rojo */
            color: white; /* Texto en color blanco */
        }
        form {
            max-width: 400px;
            margin: 0 auto;
        }
        p {
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>Encuesta de vecindad</h1>
    <form action="ActaServlet" method="POST">
        <p><label>id:</label> <input type="text" name="id"></p>
        <p><label>Nombre:</label> <input type="text" name="nombre"></p>
        <p><label>Apellido:</label> <input type="text" name="apellidos"></p>
        <p><label>Telefono:</label> <input type="text" name="telefono"></p>
        <p><label>Direccion:</label> <input type="text" name="direccion"></p>
        <p><label>No_casa:</label> <input type="text" name="No_casa"></p>
        <p><label>Muros:</label> <input type="text" name="muros"></p>
        <p><label>Pisos:</label> <input type="text" name="pisos"></p>
        <p><label>Techos:</label> <input type="text" name="techos"></p>
        <p><label>habitaciones:</label> <input type="text" name="habitaciones"></p>
        <p><label>baños:</label> <input type="text" name="banios"></p>
        <p><label>cocina:</label> <input type="text" name="cocina"></p>
        <button type="submit">Enviar</button>
    </form>
    <h1>Encuestas de vecindad</h1>
    <p>Para ver las encuestas, haga clic en el siguiente botón</p>
    <form action="ActaServlet" method="GET">
        <button type="submit">Mostrar encuestas</button>
    </form>
</body>
</html>
