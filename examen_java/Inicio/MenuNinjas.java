package examen_java.Inicio;

import examen_java.Modelo.Ninja;
import examen_java.Modelo.NinjaDAO;
import examen_java.Vista.NinjaVista;

import javax.swing.*;
import java.awt.*;

public class MenuNinjas extends JFrame {

    private JTextField ninja;
    private NinjaVista ninjaVista;

    public MenuNinjas() {
        NinjaDAO dao = new NinjaDAO();

        setTitle("Gestion de Ninjas");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        JButton btnBuscarNinjas = new JButton("Ver Ninjas con habilidades");
        JButton btnSalir = new JButton("Salir");

        List obtenerNinjas = NinjaDAO.obtenerNinjas();

        btnBuscarNinjas.addActionListener(e -> {
            if (ninjaVista == null) {
                ninjaVista = new ninjaVista(NinjaDAO.obtenerNinjas());
            }
        });
    }
}
