/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitarres;

/**
 *
 * @author alumne
 */
public class Guitarra {

    private String fabricant = null; // Fabricant
    private String model = null; // Modèl
    private double preu = 0.0; // Preu
    private int anyFabricacio = 0; // Any de fabricació
    private String paisFabricacio = null; // País de fabricació
    private boolean esElectrica = false; // És elèctrica. Sinò ho és, serà classica.
    private int cordes = 0; // Cordes
    private char series = ' '; // Series

    private boolean omplit = false;
    private char e = 'A'; //Servirà per definir si es electrica

    @Override
    public String toString() {
        return "Guitarra{" + "fabricant=" + fabricant + ", \nmodel=" + model + ", \npreu=" + preu + ", \nanyFabricacio=" + anyFabricacio + ", \npaisFabricacio=" + paisFabricacio + ", \nesElectrica=" + esElectrica + ", \ncordes=" + cordes + ", \nseries=" + series + '}';
    }

   
    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        if (preu<0) System.out.println("El preu no pot ser negatiu!!");
        else this.preu = preu;
    }

    public int getAnyFabricacio() {
        return anyFabricacio;
    }

    public void setAnyFabricacio(int anyFabricacio) {
        this.anyFabricacio = anyFabricacio;
    }

    public String getPaisFabricacio() {
        return paisFabricacio;
    }

    public void setPaisFabricacio(String paisFabricacio) {
        this.paisFabricacio = paisFabricacio;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    public int getCordes() {
        return cordes;
    }

    public void setCordes(int cordes) {
        this.cordes = cordes;
    }

    public char getSeries() {
        return series;
    }

    public void setSeries(char series) {
        this.series = series;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }

    public char getE() {
        return e;
    }

    public void setE(char e) {
        this.e = e;
    }

}
