/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radikalparchis;

/**
 *
 * @author ENTRAR
 */
public class Tablero {
    
    private Casilla[] casillas;
    
    private Pasillo pasilloRojo;
    private Casa casaRoja;
    
    private Pasillo pasilloAzul;
    private Casa casaAzul;
    
    private Pasillo pasilloVerde;
    private Casa casaVerde;    
    
    private Pasillo pasilloAmarillo;
    private Casa casaAmarilla;

    public Tablero() {
        this.casillas = new Casilla[2];
        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = new Casilla();
        }
        this.pasilloRojo = new Pasillo();
        this.casaRoja = new Casa();
        this.pasilloAzul = new Pasillo();
        this.casaAzul = new Casa();
        this.pasilloVerde = new Pasillo();
        this.casaVerde = new Casa();
        this.pasilloAmarillo = new Pasillo();
        this.casaAmarilla = new Casa();
    }

    @Override
    public String toString() {
        return "Tablero{" + "casillas=" + showCasillas() + ", pasilloRojo=" + pasilloRojo + ", casaRoja=" + casaRoja + ", pasilloAzul=" + pasilloAzul + ", casaAzul=" + casaAzul + ", pasilloVerde=" + pasilloVerde + ", casaVerde=" + casaVerde + ", pasilloAmarillo=" + pasilloAmarillo + ", casaAmarilla=" + casaAmarilla + '}';
    }

    private String showCasillas() {
        String resultado = "";
        for (int i = 0; i < casillas.length; i++) {
            Casilla casilla = casillas[i];
            resultado += casilla.toString();
        }
        return resultado;
    }
    
}
