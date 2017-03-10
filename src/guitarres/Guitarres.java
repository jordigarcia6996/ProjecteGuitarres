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

    private static final int MAXGUITARRES = 2;
    private static Guitarra[] arrayGuitarra = new Guitarra[MAXGUITARRES];
    private static int opcio;
    private static char series;
    private static char e;

    /**
     * @param args the command line arguments
     */
    public static void inicialitzarVariables() {

        for (int i = 0; i < arrayGuitarra.length; i++) {
            arrayGuitarra[i] = new Guitarra();
            arrayGuitarra[i].setOmplit(false);

        }

        opcio = 0;
        series = 'A';
        e = 'A';
    }

    public static void demanarOpcio() {
        Scanner s = new Scanner(System.in);

        System.out.println("\n==== MENÚ GUITARRES ====\n");
        System.out.println("Opció 1: Afegir guitarra.");
        System.out.println("Opció 2: Eliminar guitarra.");
        System.out.println("Opció 3: Modificar guitarra.");
        System.out.println("Opció 4: Llistar guitarres.");
        System.out.println("Opció 5: Surtir de l'aplicació.\n");

        System.out.println("Escriu una opció:");

        opcio = s.skip("[\r\n]*").nextInt();

    }

    public static void tractarOpcio() {

        switch (opcio) {

            case 1:
                introduirGuitarra();
                break;
            case 2:
                borrarGuitarra();
                break;
            case 3:
                modificarGuitarra();
                break;
            case 4:
                llistarPilots();
                break;
            case 5:
                recuperarGuitarra();
                break;
            case 6:
                sortirAplicacio();
                break;
            default:
                missatgeError();

        }

    }

    public static boolean opcioFinal() {
        return opcio == 6;
    }

    public static void main(String[] args) {

        inicialitzarVariables();
        do {
            demanarOpcio();
            tractarOpcio();
        } while (!opcioFinal());

    }

    public static void introduirGuitarra() {
        Scanner s = new Scanner(System.in);

        int i;
        for (i = 0; i < arrayGuitarra.length && arrayGuitarra[i].isOmplit(); i++);

        if (i == arrayGuitarra.length) {

            System.out.println("\nL'element ja stà plé, si vols afegir una nova guitarra,"
                    + " has de borrar una.");

        } else {

            System.out.println("\n== AFEGIR GUITARRES ==");
            System.out.println("\nIntrodueix el nom del fabricant:");
            arrayGuitarra[i].setFabricant(s.skip("[\r\n]*").nextLine());

            System.out.println("Introdueix el model:");
            arrayGuitarra[i].setModel(s.skip("[\r\n]*").nextLine());

            System.out.println("Introdueix el preu:");
            arrayGuitarra[i].setPreu(s.skip("[\r\n]*").nextDouble());

            System.out.println("Introdueix l'any de fabricació:");
            arrayGuitarra[i].setAnyFabricacio(s.skip("[\r\n]*").nextInt());

            System.out.println("Introdeuix el país de fabricació:");
            arrayGuitarra[i].setPaisFabricacio(s.skip("[\r\n]*").nextLine());

            do {

                System.out.println("Quin tipus de guitarra és (E o C):");
                switch (e = s.next().toUpperCase().charAt(0)) {
                    case 'E':

                        arrayGuitarra[i].setEsElectrica(true);

                        break;

                    case 'C':

                        arrayGuitarra[i].setEsElectrica(false);

                        break;

                    default:

                        System.out.println("Opció no valida!!");

                }

            } while (e != 'E' && e != 'C');

            System.out.println("Quantes cordes té: ");
            arrayGuitarra[i].setCordes(s.skip("[\r\n]*").nextInt());

            do {
                System.out.println("De quina serie és (A, E, I, O, U):");
                switch (series = s.next().toUpperCase().charAt(0)) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':

                        arrayGuitarra[i].setSeries(series);

                        break;

                    default:

                        System.out.println("Opció no valida");
                }

            } while (series != 'A' && series != 'E' && series != 'I' && series != 'O' && series != 'U');

            arrayGuitarra[i].setOmplit(true);

        }

    }

    public static void borrarGuitarra() {

        Scanner s = new Scanner(System.in);
        int i;

        System.out.println("\n== ELIMINAR GUITARRES ==\n");

        Guitarra g = null;
        char resposta = 'N';

        for (i = 0; i < arrayGuitarra.length && resposta != 'F'; i++) {
            g = arrayGuitarra[i];
            if (g.isOmplit()) {
                System.out.println(g);
                do {
                    System.out.println("\nVols borrar la guitara(S o N) o finalitzar la cerca (F)?:");
                    resposta = s.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (resposta != 'S' && resposta != 'N' && resposta != 'F');
            }
            if (resposta == 'S') {
                break;
            }
        }

        if (resposta == 'S') {
            g.setOmplit(false);
            System.out.println("Guitarra borrada correctament.");

        } else {
            System.out.println("\nNo s'ha borrat cap guitarra.");
        }

    }

    public static void modificarGuitarra() {
        Scanner s = new Scanner(System.in);

        char resposta = 'N';
        int compt = 0, i;
        char segur = 'A';

        System.out.println("\n== MODIFICAR GUITARRES ==\n");

        for (i = 0; i < arrayGuitarra.length && resposta != 'S' && resposta != 'F'; i++) {
            if (arrayGuitarra[i].isOmplit()) {
                System.out.format("\nGuitarra %d:\n", compt++);
                System.out.println(arrayGuitarra[i].toString());
                do {
                    System.out.println("\nVols modificar la guitarra " + compt + "(S o N) o finalitzar la cerca (F)?:");
                    resposta = s.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (resposta != 'S' && resposta != 'N' && resposta != 'F');
            }
            if (resposta == 'S') {
                break;
            }
        }

        if (resposta == 'S') {

            System.out.println("\nNom del fabricant: " + arrayGuitarra[i].getFabricant() + ".");

            System.out.println("Vols canviar el nom del fabricant?(S/N)");
            switch (segur = s.next().toUpperCase().charAt(0)) {
                case 'S':
                    System.out.println("Escriu el nou nom:");
                    arrayGuitarra[i].setFabricant(s.skip("[\r\n]*").nextLine());
                    break;
                default:

            }

            System.out.println("\nModel: " + arrayGuitarra[i].getFabricant() + ".");

            System.out.println("Vols canviar el model?(S/N)");
            switch (segur = s.next().toUpperCase().charAt(0)) {
                case 'S':
                    System.out.println("Escriu el nou model:");
                    arrayGuitarra[i].setModel(s.skip("[\r\n]*").nextLine());
                    break;
                default:

            }

            System.out.println("\nPreu: " + arrayGuitarra[i].getPreu() + ".");

            System.out.println("Vols canviar el preu?(S/N)");
            switch (segur = s.next().toUpperCase().charAt(0)) {
                case 'S':
                    System.out.println("Escriu el nou preu:");
                    arrayGuitarra[i].setPreu(s.skip("[\r\n]*").nextDouble());
                    break;
                default:

            }

            System.out.println("\nL'any de fabricació és: " + arrayGuitarra[i].getAnyFabricacio() + ".");

            System.out.println("Vols canviar l'any de fabricació?(S/N)");
            switch (segur = s.next().toUpperCase().charAt(0)) {
                case 'S':
                    System.out.println("Escriu el nou any:");
                    arrayGuitarra[i].setAnyFabricacio(s.skip("[\r\n]*").nextInt());
                    break;
                default:

            }

            System.out.println("\nEl país de fabricació és: " + arrayGuitarra[i].getPaisFabricacio() + ".");

            System.out.println("Vols canviar el país de fabricació?(S/N)");
            switch (segur = s.next().toUpperCase().charAt(0)) {
                case 'S':
                    System.out.println("Escriu el nou país:");
                    arrayGuitarra[i].setPaisFabricacio(s.skip("[\r\n]*").nextLine());
                    break;
                default:

            }

            if (arrayGuitarra[i].isEsElectrica() == true) {

                System.out.println("La guitarra és elèctrica");
            } else {
                System.out.println("La guitarra és clàssica");
            }

            System.out.println("Vols canviar el tipus de guitarra(S/N)");
            switch (segur = s.next().toUpperCase().charAt(0)) {
                case 'S':

                    if (arrayGuitarra[i].isEsElectrica() == false) {
                        arrayGuitarra[i].setEsElectrica(true);
                    } else {
                        arrayGuitarra[i].setEsElectrica(false);
                    }
                    break;
                default:

            }

            System.out.println("\nNúmero de cordes: " + arrayGuitarra[i].getCordes() + ".");

            System.out.println("Vols canviar el número de cordes?(S/N)");
            switch (segur = s.next().toUpperCase().charAt(0)) {
                case 'S':
                    System.out.println("Escriu el nou número de cordes:");
                    arrayGuitarra[i].setCordes(s.skip("[\r\n]*").nextInt());
                    break;
                default:

            }

            System.out.println("\nSerie: " + arrayGuitarra[i].getSeries() + ".");

            System.out.println("Vols canviar la serie?(S/N)");
            switch (segur = s.next().toUpperCase().charAt(0)) {
                case 'S':
                    System.out.println("Escriu la nova serie(A, E, I, O, U):");

                    do {
                        System.out.println("De quina serie és (A, E, I, O, U):");
                        arrayGuitarra[i].setSeries(s.skip("[\r\n]*").nextLine().toUpperCase().charAt(0));
                        switch (arrayGuitarra[i].getSeries()) {
                            case 'A':
                            case 'E':
                            case 'I':
                            case 'O':
                            case 'U':

                                System.out.println("Serie " + arrayGuitarra[i].getSeries() + " introduïda"
                                        + " correctament.");

                                break;

                            default:

                                System.out.println("Opció no valida");
                        }

                    } while (arrayGuitarra[i].getSeries() != 'A' && arrayGuitarra[i].getSeries() != 'E' && arrayGuitarra[i].getSeries() != 'I' && arrayGuitarra[i].getSeries() != 'O' && arrayGuitarra[i].getSeries() != 'U');

                    break;
                default:

            }

        }

    }

    public static void llistarPilots() {
        Scanner s = new Scanner(System.in);

        System.out.println("\n== LLISTAR GUITARRES ==\n");

        for (int j = 0; j < arrayGuitarra.length; j++) {
            if (arrayGuitarra[j].isOmplit()) {
                System.out.print(arrayGuitarra[j]);

            }

        }

        System.out.println("");

    }

    public static void recuperarGuitarra() {
        Scanner s = new Scanner(System.in);

        char resposta = 'N';
        int compt = 0, i;
        for (i = 0; i < arrayGuitarra.length && resposta != 'S' && resposta != 'F'; i++) {
            if (!arrayGuitarra[i].isOmplit()) {
                System.out.format("\nGuitarra %d:\n", ++compt);
                System.out.println(arrayGuitarra[i].toString());
                do {
                    System.out.println("\nVols recuperar la guitarra(S o N) o finalitzar la cerca (F)?:");
                    resposta = s.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

                } while (resposta != 'S' && resposta != 'N' && resposta != 'F');
            }
            if (resposta == 'S') {
                break;
            }
        }

        if (resposta == 'S') {
            arrayGuitarra[i].setOmplit(true);
            System.out.println("Pilot recuperat correctament.");
        } else if (compt == 0) {
            System.out.println("No hi ha pilots per recuperat.");
        } else {
            System.out.println("Pilot no recuperat.");
        }

    }

    public static void sortirAplicacio() {

        System.out.println("\nHas sortit de l'aplicació.");

    }

    public static void missatgeError() {

        System.out.println("\nOpció incorrecta!!");

    }

}
