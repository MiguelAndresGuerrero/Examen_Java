package examen_java.Inicio;

import examen_java.Modelo.Misiones;
import examen_java.Modelo.MisionesDAO;
import examen_java.Vista.MisionesVista;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MenuMisiones extends JFrame {
    private MisionesVista misionesVista;

    public MenuMisiones() {

        setTitle("Gestion de Ninjas");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel titulo = new JLabel("Menu de Ninjas", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));

        JButton btnBuscarMisones = new JButton("Ver Misiones");
        JButton btnSalir = new JButton("Salir");


        btnBuscarMisones.addActionListener(e -> {
            List<Misiones> ListaMisiones = MisionesDAO.obtenerMisiones();
            if (misionesVista == null || !misionesVista.isDisplayable()) {
                misionesVista = new MisionesVista(ListaMisiones);
                misionesVista.setVisible(true);
            }
        });

        btnSalir.addActionListener(e -> dispose());

        add(titulo);
        add(btnBuscarMisones);
        add(btnSalir);

        setVisible(true);
    }
}