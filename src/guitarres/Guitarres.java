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
                    
                    if (omplit){
                        
                    }else{
                    System.out.println("\nIntrodueix el nom del fabricant:");
                    fabricant=s.next();
                    
                    System.out.println("\nEl fabricant introduït és "+fabricant+".\n");
                    
                    System.out.println("Introdueix el model:");
                    model=s.next();
                    
                    System.out.println("Introdueix el preu:");
                    preu=s.nextDouble();
                    
                    System.out.println("Introdueix l'any de fabricació:");
                    anyFabricacio=s.nextInt();
                    
                    System.out.println("Introdeuix el pais de fabricació:");
                    paisFabricacio=s.next();
                    
                    
                    
                    char e = 'A';
                    
                    do {
                        
                        System.out.println("Quin tipus de guitarra és (E o C):");
                        switch (e=s.next().toUpperCase().charAt(0)) {
                            case 'E':
                                                            
                                esElectrica=true;
                                
                                break;
                                
                            case 'C':
                            
                                
                                esElectrica=false;
                                
                                break;
                                
                            default:
                                
                                System.out.println("Opció no valida!!");
                                
                        }
                        
                    }while( e!='E' && e!='C');
                    
                    
                   
                    System.out.println("Quantes cordes té: ");
                    cordes=s.nextInt();
                     
                    do{
                    System.out.println("De quina serie és (A, E, I, O, U):");
                        switch (series=s.next().charAt(0)) {
                            case 'A':
                            case 'E':
                            case 'I':
                            case 'O':
                            case 'U':
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                
                                System.out.println("Serie "+series+" introduïda"
                                        + " correctament.");
                            
                                
                                break;
                            
                            default:
                                
                                System.out.println("Opció no valida");
                        }
                        
                    }while(series!='A' || series!='a' || series!='E' || series!='e' 
                            || series!='I' || series!='i' || series!='O' || series!='o' 
                            || series!='U' || series!='u');
   
                        
                        
                    omplit=true;
                    if (omplit){
                        System.out.println("L'element ja stà plé, si vols omplr un altre,"
                                + " has de borrar este.");
                    }
                    }

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
