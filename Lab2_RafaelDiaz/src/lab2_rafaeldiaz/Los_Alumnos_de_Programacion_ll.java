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
public class Los_Alumnos_de_Programacion_ll {
    String apodo, gradoacademico, tipoarma;
    int numcuenta, edad, resistencia;

    public Los_Alumnos_de_Programacion_ll(String apodo, String gradoacademico, String tipoarma) {
        this.apodo = apodo;
        this.gradoacademico = gradoacademico;
        this.tipoarma = tipoarma;
    }

    public Los_Alumnos_de_Programacion_ll(int numcuenta, int edad, int resistencia) {
        this.numcuenta = numcuenta;
        this.edad = edad;
        this.resistencia = resistencia;
    }
    
}
