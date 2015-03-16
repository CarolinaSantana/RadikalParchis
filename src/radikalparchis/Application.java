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
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego(new Tablero(), new Dado(), new Jugador[] {
            new Jugador(Jugador.ROJO),
            new Jugador(Jugador.AZUL),
            new Jugador(Jugador.AMARILLO),
            new Jugador(Jugador.VERDE)
        });
        System.out.println(juego);
    }
    
}
