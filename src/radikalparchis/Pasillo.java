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
public class Pasillo {
    
    private Casilla[] casillas;
    
    private Meta meta;

    public Pasillo() {
        this.casillas = new Casilla[] {
            new Casilla(),
            new Casilla(),
            new Casilla(),
            new Casilla(),
            new Casilla(),
            new Casilla(),
            new Casilla()
        };
        this.meta = new Meta();
    }
    
    
    
}
