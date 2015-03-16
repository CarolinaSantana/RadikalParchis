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
public class Ficha {
    
    private int posicion;
    private String color;

    public Ficha(int posicion, String color) {
        this.posicion = posicion;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ficha{" + "posicion=" + posicion + ", color=" + color + '}';
    }
    
}
