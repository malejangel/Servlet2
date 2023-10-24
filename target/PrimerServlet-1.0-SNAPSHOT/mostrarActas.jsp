<%-- 
    Document   : mostrarActas
    Created on : 26/09/2023, 11:22:01 p. m.
    Author     : aleja
--%>

<%@page import="com.mycompany.primerservlet.models.Acta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mostrar Actas</title>
    <style>
        body {
            background-color: red; /* Fondo rojo */
            color: white; /* Texto en blanco */
        }
        table {
            border-collapse: collapse;
            width: 50%;
            margin-top: 20px;
            background-color: white; /* Fondo blanco */
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
            color: black; /* Texto en negro */
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Lista de Actas Registradas</h1>

    <%
        List<Acta> listaActa = (List<Acta>) request.getSession().getAttribute("listaActa");
        int cont = 1;
        for (Acta usu : listaActa) {
    %>       
    <table>
        <tr>
            <th colspan="2">Acta N°<%= cont %></th>
        </tr>
        <tr>
            <td>id:</td>
            <td><%= usu.getId() %></td>
        </tr>
        <tr>
            <td>nombre:</td>
            <td><%= usu.getNombre() %></td>
        </tr>
        <tr>
            <td>apellido:</td>
            <td><%= usu.getApellido() %></td>
        </tr>
        <tr>
            <td>telefono:</td>
            <td><%= usu.getTelefono() %></td>
        </tr>
        <tr>
            <td>direccion:</td>
            <td><%= usu.getDireccion() %></td>
        </tr>
        <tr>
            <td>No_casa:</td>
            <td><%= usu.getNo_casa() %></td>
        </tr>
        <tr>
            <td>Muros:</td>
            <td><%= usu.getMuros() %></td>
        </tr>
        <tr>
            <td>Pisos:</td>
            <td><%= usu.getPisos() %></td>
        </tr>
        <tr>
            <td>Techos:</td>
            <td><%= usu.getTechos() %></td>
        </tr>
        <tr>
            <td>Habitaciones:</td>
            <td><%= usu.getHabitaciones() %></td>
        </tr>
        <tr>
            <td>Baños:</td>
            <td><%= usu.getBaños() %></td>
        </tr>
        <tr>
            <td>Cocina:</td>
            <td><%= usu.getCocina() %></td>
        </tr>
    </table>
    <% cont++; %>
    <% } %>
</body>
</html>

