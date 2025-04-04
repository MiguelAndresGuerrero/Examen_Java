package examen_java.Modelo;

import examen_java.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NinjaDAO {
    
    public static List<Ninja> obtenerNinjas() {
        List<Ninja> ninjas = new ArrayList<>();

        String sql = "SELECT N.ID, N.Nombre AS Nombre_Ninja, N.Rango AS Rango_Ninja, \n" +
                "N.Aldea AS Nombre_Aldea, H.Nombre AS Habilidad, \n" +
                "H.Descripcion AS Descripcion_Habilidad\n" +
                "FROM Ninja N \n" +
                "INNER JOIN Habilidad H ON N.id = H.id_ninja;\n";
        
        try (Connection con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){

            while (rs.next()) {
                Ninja ninja = new Ninja(
                        rs.getInt("ID"),
                        rs.getString("Nombre_Ninja"),
                        rs.getString("Rango_Ninja"),
                        rs.getString("Nombre_Aldea"),
                        rs.getString("Habilidad"),
                        rs.getString("Descripcion_Habilidad")
                );
                ninjas.add(ninja);
                System.out.println(ninja);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return ninjas;
    }
}