package examen_java.Inicio;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        setTitle("Menu Principal");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 1));

        JLabel Titulo = new JLabel("Sistema de administracion ninja");
        JButton btnVerNinjas  = new JButton("Listar todos los ninjas con habilidades");
        JButton btnMostrarMisiones = new JButton("Misiones disponibles");
        JButton btnMostrarMisionesCompletasPorNinja = new JButton("Misiones completas para un ninja especifico");
        JButton btnAsignarMision = new JButton("Asignar mision a un ninja");
        JButton btnMarcarMision = new JButton("Marcar mision como completada");
        JButton btnMostrarMisionesCompletadas  = new JButton("Mostrar todas las misiones completadas");
        JButton btnSalir = new JButton("Salir");

        btnVerNinjas.addActionListener(e -> new MenuNinjas().setVisible(true));
        btnMostrarMisiones.addActionListener(e -> new MenuMisiones().setVisible(true));
        btnMostrarMisionesCompletasPorNinja.addActionListener(e -> new MenuMisiones().setVisible(true));
        btnAsignarMision.addActionListener(e -> new MenuMisiones().setVisible(true));
        btnMarcarMision.addActionListener(e -> new MenuMisiones().setVisible(true));
        btnMostrarMisionesCompletadas.addActionListener(e -> new MenuMisiones().setVisible(true));
        btnSalir.addActionListener(e -> System.exit(0));

        add(Titulo);
        add(btnVerNinjas);
        add(btnMostrarMisiones);
        add(btnMostrarMisionesCompletasPorNinja);
        add(btnAsignarMision);
        add(btnMarcarMision);
        add(btnMostrarMisionesCompletadas);
        add(btnSalir);
    }
}