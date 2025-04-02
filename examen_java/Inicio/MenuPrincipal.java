package examen_java.Inicio;

import java.util.Scanner;
import examen_java.Modelo.Ninja;
import examen_java.Modelo.NinjaDAO;

public class MenuPrincipal {

    public MenuPrincipal() {
        Scanner sc = new Scanner(System.in);

        boolean boleanito = true;
        
         while (boleanito == true) {
                System.out.println("=================================================");
                System.out.println("Menu Principal");
                System.out.println("1. Listar todos los ninjas junto con sus habilidades");
                System.out.println("2. Mostrar las misiones disponibles para un ninja específico");
                System.out.println("3. Mostrar las misiones completadas para un ninja específico");
                System.out.println("4. Asignar una misión a un ninja");
                System.out.println("5. Marcar una misión como completada");
                System.out.println("6. Mostrar todas las misiones completadas");
                System.out.println("7. Salir");
                System.out.println("=================================================");
                int opcion = sc.nextInt();

                switch (opcion) {
                case 1:
                    System.out.println("Mostrando ninjas junto a sus habilidades");
                    // System.out.println(NinjaDAO.getClass(obtenerNinjas()));
                    break;
                    
                case 2:
                    System.out.println("Mostrando misiones para un ninja especifico");
                    break;
                    
                case 3:
                    System.out.println("Mostrando misiones completadas para un ninja especifico");
                    break;
                 
                case 4:
                    System.out.println("Asignando mision a un ninja");
                    break;
                    
                case 5:
                    System.out.println("Marcando mision como completada");
                    break;
                
                case 6:
                    System.out.println("Mostrando misiones completadas");
                    break;
                    
                case 7:
                    System.out.println("Saliendo del programa...");
                    boleanito = false;
                    break;
                    
                default:
                    throw new AssertionError();
            }
        }
        sc.close();
    }
}