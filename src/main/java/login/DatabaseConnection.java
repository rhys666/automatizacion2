package login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/login"; // Cambia el nombre de la base de datos
    private static final String USER = "root"; // Tu usuario de MySQL
    private static final String PASSWORD = ""; // Tu contraseña de MySQL

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Asegúrate de tener el controlador MySQL
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error: Driver no encontrado");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: No se pudo establecer la conexión a la base de datos");
        }
        return conn;
    }
}