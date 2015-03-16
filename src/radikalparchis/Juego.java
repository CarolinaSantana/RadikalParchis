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
public class Juego {
    
    private Tablero tablero;
    private Dado dado;
    private Jugador[] jugadores;

    public Juego(Tablero tablero, Dado dado, Jugador[] jugadores) {
        this.tablero = tablero;
        this.dado = dado;
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "tablero=" + tablero + ", dado=" + dado + ", jugadores=" + jugadores + '}';
    }
    
}
