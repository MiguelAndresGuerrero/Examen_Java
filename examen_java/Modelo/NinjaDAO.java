package examen_java.Modelo;

import examen_java.Conexion;
import java.sql.*;

public class NinjaDAO {
    private final Connection conexion;
    
    public NinjaDAO(){
        this.conexion = Conexion.getConnection();
    }
    
     public List<Ninja> obtenerTodos() {
        List<Ninja> lista = new ArrayList<>();
        String sql = "SELECT * FROM Ninja";

        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Ninja ninja = new Ninja(
                        System.out.println("ID: " + rs.getInt("ID"));
                        System.out.println("Nombre: " + rs.getString("Nombre"));
                        System.out.println("Rango: " + rs.getString("Rango"));
                        System.out.println("Aldea: " + rs.getString("Aldea"));
                        System.out.println("Habilidad: " + rs.getString("Habilidad"));
                        System.out.println("Descripcion: " + rs.getString("Descripcion"));
                );
                lista.add(ninja);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}