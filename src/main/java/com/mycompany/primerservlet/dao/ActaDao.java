package com.mycompany.primerservlet.dao;

import com.mycompany.primerservlet.models.Acta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActaDao {

    private static Connection conexion;

    public ActaDao() {
        String host = "localhost";
        String puerto = "3306";
        String nameDB = "actas";
        String usuario = "root";
        String pass = "";
        String driver = "com.mysql.cj.jdbc.Driver";

        String databaseURL = "jdbc:mysql://" + host + ":" + puerto + "/" + nameDB + "?useSSL=false";

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(databaseURL, usuario, pass);
            System.out.println("Conexión establecida");
        } catch (Exception ex) {
            System.err.println("Error al conectar: " + ex.getMessage());
        }
    }
    // Método para obtener entrada del usuario

    private static String obtenerEntradaUsuario(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }
    // Método para insertar un nuevo registro

    public void insertarRegistro(String nombre, String apellidos, String telefono, String direccion, String No_casa , String muros, String pisos, String techos, String habitaciones, String banios, String cocina, int id ) {
        String sql = "INSERT INTO realizadas (Nombre, Apellidos,Telefono, Direccion"
                + ", No_casa, muros , pisos, techos, Habitaciones,banios, cocina,id ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, apellidos);
            statement.setString(3, telefono);
            statement.setString(4, direccion);
            statement.setString(5,No_casa );
            statement.setString(6,muros );
            statement.setString(7, pisos);
            statement.setString(8,techos );
            statement.setString(9,habitaciones);
            statement.setString(10,banios );
            statement.setString(11,cocina);
            statement.setInt(12, id);
            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Registro insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el registro.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al insertar registro: " + ex.getMessage());
        }
    }
    // Método para mostrar los registros de la tabla

    public List<Acta> mostrarRegistros() {
        String sql = "SELECT * FROM realizadas";
        List<Acta> actas = new ArrayList<>();
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // Leer los datos de cada registro
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellidos");
                String telefono = resultSet.getString("telefono");
                String direccion = resultSet.getString("direccion");
                String No_casa = resultSet.getString("No_casa");
                String muros = resultSet.getString("muros");
                String pisos = resultSet.getString("pisos");
                String techos = resultSet.getString("techos");
                String habitaciones = resultSet.getString("habitaciones");
                String baños = resultSet.getString("banios");
                String cocina = resultSet.getString("cocina");
                Acta acta = new Acta(id, nombre, apellido,telefono,direccion,No_casa,muros,pisos,techos,habitaciones,baños,cocina);
                actas.add(acta);

          
            }

        } catch (SQLException ex) {
            System.err.println("Error al mostrar registros: " + ex.getMessage());
        }
        return actas;
    }

// Método para eliminar un registro por ID
    public void eliminarRegistro(int id) {
        String sql = "DELETE FROM empleados WHERE id=?";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Registro eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el registro.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al eliminar registro: " + ex.getMessage());
        }
    }
}
