/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitarres;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Guitarres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //======================= Variables dels objectes ==================
        
        String fabricant = null; // Fabricant
        String model = null; // Modèl
        double preu = 0.0; // Preu
        int anyFabricacio = 0; // Any de fabricació
        String paisFabricacio = null; // País de fabricació
        boolean esElectrica = false; // És elèctrica. Sinò ho és, serà classica.
        int cordes = 0; // Cordes
        char series = ' '; // Series
        
        boolean omplit = false;

        //========================= Variable del menú =======================
       
        int opcio = 0;

        //========================= Menú de l'aplicació ======================
        
        do {
            System.out.println("\n==== MENÚ GUITARRES ====\n");
            System.out.println("Opció 1: Afegir guitarra.");
            System.out.println("Opció 2: Eliminar guitarra.");
            System.out.println("Opció 3: Modificar guitarra.");
            System.out.println("Opció 4: Llistar guitarres.");
            System.out.println("Opció 5: Surtir de l'aplicació.\n");
            
            System.out.println("Escriu una opció:");

            switch (opcio = s.nextInt()) {
                case 1:
                    
                    System.out.println("Introdueix el nom del fabricant:");
                    fabricant=s.nextLine();
                    
                    System.out.println("Introdueix el model:");
                    model=s.nextLine();
                    
                    System.out.println("Introdueix el preu:");
                    preu=s.nextDouble();
                    
                    System.out.println("Introdueix l'any de fabricació:");
                    anyFabricacio=s.nextInt();
                    
                    System.out.println("Introdeuix el pais de fabricació:");
                    paisFabricacio=s.nextLine();
                    
                    System.out.println("Quin tipus de guitarra és:");
                    
                    esElectrica=s.nextBoolean();

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    System.out.println("\nHas sortit de l'aplicació.");
                    break;

                default:
                    System.out.println("\nOpció no valida!!!\n");
            }

        } while (opcio != 5);

    }

}
