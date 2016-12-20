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
        char e = 'A'; //Servirà per definir si es electrica

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

                    if (omplit) {

                        System.out.println("\nL'element ja stà plé, si vols omplr un altre,"
                                + " has de borrar este.");

                    } else {

                        System.out.println("\n== AFEGIR GUITARRES ==");
                        System.out.println("\nIntrodueix el nom del fabricant:");
                        fabricant = s.next();

                        System.out.println("Introdueix el model:");
                        model = s.next();

                        System.out.println("Introdueix el preu:");
                        preu = s.nextDouble();

                        System.out.println("Introdueix l'any de fabricació:");
                        anyFabricacio = s.nextInt();

                        System.out.println("Introdeuix el país de fabricació:");
                        paisFabricacio = s.next();

                        do {

                            System.out.println("Quin tipus de guitarra és (E o C):");
                            switch (e = s.next().toUpperCase().charAt(0)) {
                                case 'E':

                                    esElectrica = true;

                                    break;

                                case 'C':

                                    esElectrica = false;

                                    break;

                                default:

                                    System.out.println("Opció no valida!!");

                            }

                        } while (e != 'E' && e != 'C');

//                        if (e == 'E') {
//                            System.out.println("\nLa guitarra és elèctrica.\n");
//
//                        } else {
//                            System.out.println("\nLa guitarra és clàssica.\n");
//
//                        }
                        System.out.println("Quantes cordes té: ");
                        cordes = s.nextInt();

                        do {
                            System.out.println("De quina serie és (A, E, I, O, U):");
                            switch (series = s.next().toUpperCase().charAt(0)) {
                                case 'A':
                                case 'E':
                                case 'I':
                                case 'O':
                                case 'U':

                                    System.out.println("Serie " + series + " introduïda"
                                            + " correctament.");

                                    break;

                                default:

                                    System.out.println("Opció no valida");
                            }

                        } while (series != 'A' && series != 'E' && series != 'I' && series != 'O' && series != 'U');

                        omplit = true;

                    }

                    break;

                case 2:

                    System.out.println("\n== ELIMINAR GUITARRES ==\n");

                    char segur = 'A';

                    if (!omplit) {

                        System.out.println("No pots eliminar perquè no hi ha guitarres. Afegeix una!!");

                    } else {
                        System.out.println("Vols veure les dades de la guitarra?(S/N)");
                        switch (segur = s.next().toUpperCase().charAt(0)) {
                            case 'S':

                                System.out.println("\nNom del fabricant: " + fabricant + ".");
                                System.out.println("Modèl: " + model + ".");
                                System.out.println("Preu: " + preu + ".");
                                System.out.println("L'any de fabricació és: " + anyFabricacio + ".");
                                System.out.println("El país de fabricació és: " + paisFabricacio + ".");
                                if (e == 'E') {

                                    System.out.println("La guitarra és elèctrica");
                                } else {
                                    System.out.println("La guitarra és clàssica");
                                }
                                System.out.println("Número de cordes: " + cordes + ".");
                                System.out.println("Serie: " + series + ".");

                                break;

                            default:

                        }

                        System.out.println("Estas segur de eliminar la guitarra? (S/N)");

                        switch (segur = s.next().toUpperCase().charAt(0)) {
                            case 'S':

                                omplit = false;

                                System.out.println("Guitarra eliminada.");

                                break;
                            default:

                        }

                    }

                    break;

                case 3:

                    System.out.println("\n== MODIFICAR GUITARRES ==\n");

                    if (!omplit) {

                        System.out.println("No pots eliminar perquè no hi ha guitarres. Afegeix una!!");

                    } else {
                        System.out.println("Vols veure les dades de la guitarra?(S/N)");
                        switch (segur = s.next().toUpperCase().charAt(0)) {
                            case 'S':

                                System.out.println("\nNom del fabricant: " + fabricant + ".");
                                System.out.println("Model: " + model + ".");
                                System.out.println("Preu: " + preu + ".");
                                System.out.println("L'any de fabricació és: " + anyFabricacio + ".");
                                System.out.println("El país de fabricació és: " + paisFabricacio + ".");
                                if (e == 'E') {

                                    System.out.println("La guitarra és elèctrica");
                                } else {
                                    System.out.println("La guitarra és clàssica");
                                }
                                System.out.println("Número de cordes: " + cordes + ".");
                                System.out.println("Serie: " + series + ".");

                                break;

                            default:

                        }

                        System.out.println("Vols modificar la guitarra? (S/N)");

                        switch (segur = s.next().toUpperCase().charAt(0)) {
                            case 'S':

                                System.out.println("\nNom del fabricant: " + fabricant + ".");

                                System.out.println("Vols canviar el nom del fabricant?(S/N)");
                                switch (segur = s.next().toUpperCase().charAt(0)) {
                                    case 'S':
                                        System.out.println("Escriu el nou nom:");
                                        fabricant = s.next();
                                        break;
                                    default:

                                }

                                System.out.println("\nModel: " + model + ".");

                                System.out.println("Vols canviar el model?(S/N)");
                                switch (segur = s.next().toUpperCase().charAt(0)) {
                                    case 'S':
                                        System.out.println("Escriu el nou model:");
                                        model = s.next();
                                        break;
                                    default:

                                }

                                System.out.println("\nPreu: " + preu + ".");

                                System.out.println("Vols canviar el preu?(S/N)");
                                switch (segur = s.next().toUpperCase().charAt(0)) {
                                    case 'S':
                                        System.out.println("Escriu el nou preu:");
                                        preu = s.nextDouble();
                                        break;
                                    default:

                                }

                                System.out.println("\nL'any de fabricació és: " + anyFabricacio + ".");

                                System.out.println("Vols canviar l'any de fabricació?(S/N)");
                                switch (segur = s.next().toUpperCase().charAt(0)) {
                                    case 'S':
                                        System.out.println("Escriu el nou any:");
                                        anyFabricacio = s.nextInt();
                                        break;
                                    default:

                                }

                                System.out.println("\nEl país de fabricació és: " + paisFabricacio + ".");

                                System.out.println("Vols canviar el país de fabricació?(S/N)");
                                switch (segur = s.next().toUpperCase().charAt(0)) {
                                    case 'S':
                                        System.out.println("Escriu el nou país:");
                                        paisFabricacio = s.next();
                                        break;
                                    default:

                                }

                                if (e == 'E') {

                                    System.out.println("La guitarra és elèctrica");
                                } else {
                                    System.out.println("La guitarra és clàssica");
                                }

                                System.out.println("Vols canviar el tipus de guitarra(S/N)");
                                switch (segur = s.next().toUpperCase().charAt(0)) {
                                    case 'S':
                                       esElectrica=!esElectrica;
                                       if (e=='C'){
                                           e='E';
                                       }else{
                                           e='C';
                                       }
                                        break;
                                    default:

                                }

                                System.out.println("\nNúmero de cordes: " + cordes + ".");

                                System.out.println("Vols canviar el número de cordes?(S/N)");
                                switch (segur = s.next().toUpperCase().charAt(0)) {
                                    case 'S':
                                        System.out.println("Escriu el nou número de cordes:");
                                        cordes = s.nextInt();
                                        break;
                                    default:

                                }

                                System.out.println("\nSerie: " + series + ".");

                                System.out.println("Vols canviar la serie?(S/N)");
                                switch (segur = s.next().toUpperCase().charAt(0)) {
                                    case 'S':
                                        System.out.println("Escriu la nova serie(A, E, I, O, U):");

                                        do {
                                            System.out.println("De quina serie és (A, E, I, O, U):");
                                            switch (series = s.next().toUpperCase().charAt(0)) {
                                                case 'A':
                                                case 'E':
                                                case 'I':
                                                case 'O':
                                                case 'U':

                                                    System.out.println("Serie " + series + " introduïda"
                                                            + " correctament.");

                                                    break;

                                                default:

                                                    System.out.println("Opció no valida");
                                            }

                                        } while (series != 'A' && series != 'E' && series != 'I' && series != 'O' && series != 'U');

                                        break;
                                    default:

                                }

                                break;
                            default:

                        }

                    }

                    break;

                case 4:

                    if (omplit) {
                        System.out.println("\n== LLISTAR GUITARRES ==\n");

                        System.out.println("Nom del fabricant: " + fabricant + ".");
                        System.out.println("Modèl: " + model + ".");
                        System.out.println("Preu: " + preu + ".");
                        System.out.println("L'any de fabricació és: " + anyFabricacio + ".");
                        System.out.println("El país de fabricació és: " + paisFabricacio + ".");
                        if (e == 'E') {

                            System.out.println("La guitarra és elèctrica");
                        } else {
                            System.out.println("La guitarra és clàssica");
                        }
                        System.out.println("Número de cordes: " + cordes + ".");
                        System.out.println("Serie: " + series + ".");
                    } else {
                        System.out.println("\nNo hi ha cap guitarra, afegeix una!!");
                    }

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
