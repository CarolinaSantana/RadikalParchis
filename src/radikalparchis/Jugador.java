/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radikalparchis;

import java.util.ArrayList;

/**
 *
 * @author ENTRAR
 */
public class Jugador {
    
    public static final String ROJO = new String();
    public static final String AZUL = new String();
    public static final String AMARILLO = new String();
    public static final String VERDE = new String();
    
    private String color;
    private ArrayList<Ficha> fichas;

    public Jugador(String color) {
        this.color = color;
    }
    
}
