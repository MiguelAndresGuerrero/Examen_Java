package examen_java.Inicio;

import examen_java.Modelo.Ninja;
import examen_java.Modelo.NinjaDAO;
import examen_java.Vista.NinjaVista;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MenuNinjas extends JFrame {

    private NinjaVista ninjaVista;

    public MenuNinjas() {

        setTitle("Gestion de Ninjas");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel titulo = new JLabel("Menu de Ninjas", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));

        JButton btnBuscarNinjas = new JButton("Ver Ninjas con habilidades");
        JButton btnSalir = new JButton("Salir");


        btnBuscarNinjas.addActionListener(e -> {
            List<Ninja> ListaNinjas = NinjaDAO.obtenerNinjas();
            if (ninjaVista == null || !ninjaVista.isDisplayable()) {
                ninjaVista = new NinjaVista(ListaNinjas);
                ninjaVista.setVisible(true);
            }
        });

        btnSalir.addActionListener(e -> dispose());

        add(titulo);
        add(btnBuscarNinjas);
        add(btnSalir);

        setVisible(true);
    }
}