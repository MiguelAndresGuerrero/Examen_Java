package examen_java;

import java.sql.*;

public class Conexion {    
    public static final String URL = "jdbc:mysql://u3j5hwrggtls5thq:FTwK9X1Lo9QjTMT5a1nZ@bk82ii3zmnfm4ydaqj0c-mysql.services.clever-cloud.com:3306/bk82ii3zmnfm4ydaqj0c";
    public static final String USUARIO = "bk82ii3zmnfm4ydaqj0c";
    public static final String CONTRASENA  = "FTwK9X1Lo9QjTMT5a1nZ";

    public static Connection getConnection() {
        try {
            System.out.println("Conexion establecida");
            return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al conectar con la base de datos");
        }
    }
}