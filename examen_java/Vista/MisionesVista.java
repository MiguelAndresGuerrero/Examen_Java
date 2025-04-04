package examen_java.Vista;

import examen_java.Modelo.Misiones;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class MisionesVista extends JFrame {
    public MisionesVista(List<Misiones> misiones) {
        setTitle("Lista de misiones ninjas");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String [] columnMisiones = {"ID_Ninja", "ID_Mision", "Fecha_inicio", "Fecha_fin"};
        DefaultTableModel tableModel = new DefaultTableModel(columnMisiones,0);

        for (Misiones Misiones : misiones) {
            Object[] rowData = {
                    Misiones.getId(),
                    Misiones.getID_Ninja(),
                    Misiones.getID_Mision(),
                    Misiones.getFecha_inicio(),
                    Misiones.getFecha_fin()
            };
            tableModel.addRow(rowData);
        }

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }
}