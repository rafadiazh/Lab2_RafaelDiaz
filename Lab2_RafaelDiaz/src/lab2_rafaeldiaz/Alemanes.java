/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_rafaeldiaz;

/**
 *
 * @author Rafael
 */
public class Alemanes {
    String alias, casta, tipoarma;
    int edad, resistencia;

    public Alemanes(String alias, String casta, String tipoarma) {
        this.alias = alias;
        this.casta = casta;
        this.tipoarma = tipoarma;
    }

    public Alemanes(int edad, int resistencia) {
        this.edad = edad;
        this.resistencia = resistencia;
    }
    
}
