package examen_java.Vista;

import examen_java.Modelo.Ninja;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class NinjaVista extends JFrame {
    private DefaultTableModel model;
    private JTable tablaNinjas;

    public NinjaVista(List<Ninja> ninjas) {
        setTitle("Lista de Ninjas");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] columnas = {"ID", "Nombre", "Rango", "Aldea", "Habilidad", "Descripcion"};
        model = new DefaultTableModel(columnas, 0);
        tablaNinjas = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tablaNinjas);

        JButton btnVolver = new JButton("Volver");
        btnVolver.addActionListener(e -> dispose());

        add(scrollPane, BorderLayout.CENTER);
        add(btnVolver, BorderLayout.SOUTH);

        setVisible(true);
    }
}