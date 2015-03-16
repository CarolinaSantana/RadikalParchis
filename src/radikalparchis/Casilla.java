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
        fichas[0]=null;
        fichas[1]=null;
    }
    
    public Casilla() {
        this.esSegura = false;
    }

    @Override
    public String toString() {
        String resultado="Casilla{";
        for (int i = 0; i < fichas.length; i++) {
            if(fichas[i]!=null)
            {
                resultado += "fichas=" + fichas[i];
            }
        }
        return resultado + ", esSegura=" + esSegura + '}';
    }
    
}
