package examen_java.Modelo;

import examen_java.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MisionesDAO {

    public static List<Misiones> obtenerMisiones() {
        List<Misiones> Misiones = new ArrayList<>();

        String sql = "SELECT *\n" +
                "FROM Mision M\n" +
                "INNER JOIN MisionNinja MN ON M.ID = MN.ID_Mision\n" +
                "WHERE MN.Fecha_fin IS NULL;";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()){

            while (rs.next()) {
                Misiones misiones = new Misiones(
                        rs.getInt("ID"),
                        rs.getInt("ID_Ninja"),
                        rs.getInt("ID_Mision"),
                        rs.getString("Fecha_inicio"),
                        rs.getString("Fecha_fin")
                );
                Misiones.add(misiones);
                System.out.println(misiones);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return Misiones;
    }
}