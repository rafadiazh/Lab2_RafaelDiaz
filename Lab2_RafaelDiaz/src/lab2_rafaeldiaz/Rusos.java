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
public class Rusos {
    String nombre, rango, arma;
    int ID, edad, resistencia;

    public Rusos(String nombre, String rango, String arma) {
        this.nombre = nombre;
        this.rango = rango;
        this.arma = arma;
    }

    public Rusos(int ID, int edad, int resistencia) {
        this.ID = ID;
        this.edad = edad;
        this.resistencia = resistencia;
    }
    
}
