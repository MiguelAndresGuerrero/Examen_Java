package examen_java.Modelo;

import examen_java.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NinjaDAO {
    
    public static java.awt.List obtenerNinjas() {
        List<Ninja> ninjas = new ArrayList<>();

        String sql = "SELECT N.ID, N.Nombre AS Nombre_Ninja, N.Rango AS Rango_Ninja, N.Aldea AS Nombre_Aldea, H.Nombre AS Habilidad, H.Descripcion AS Descripcion_Habilidad\n" +
                "FROM Ninja N INNER JOIN Habilidad H on N.id = H.id_ninja;";
        try (Connection con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){

            while (rs.next()) {
                ninjas.add(new Ninja(
                        rs.getInt("ID"),
                        rs.getString("Nombre"),
                        rs.getString("Rango"),
                        rs.getString("Aldea"),
                        rs.getString("Habilidad"),
                        rs.getString("Descripcion")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return obtenerNinjas();
    }
}