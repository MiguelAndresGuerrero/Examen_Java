package examen_java.Vista;

import examen_java.Modelo.Ninja;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class NinjaVista extends JFrame {

    public NinjaVista(List<Ninja> ninjas) {
        setTitle("Lista de Ninjas con Habilidades");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columnNames = {"ID", "Nombre", "Rango", "Aldea", "Habilidad", "Descripción"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Ninja ninja : ninjas) {
            Object[] rowData = {
                    ninja.getId(),
                    ninja.getNombre(),
                    ninja.getRango(),
                    ninja.getAldea(),
                    ninja.getHabilidad(),
                    ninja.getDescripcion()
            };
            model.addRow(rowData);
        }

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);
    }
}