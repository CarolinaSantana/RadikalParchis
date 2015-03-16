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
public class Casilla {
    
    private Ficha[] fichas = new Ficha[2];
    boolean esSegura;

    public Casilla(boolean esSegura) {
        this.esSegura = esSegura;
    }
    
    public Casilla() {
        this.esSegura = false;
    }

    @Override
    public String toString() {
        return "Casilla{" + "fichas=" + fichas + ", esSegura=" + esSegura + '}';
    }
    
}
