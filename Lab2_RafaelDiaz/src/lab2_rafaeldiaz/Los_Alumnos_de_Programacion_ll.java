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

    public Los_Alumnos_de_Programacion_ll(String apodo, String gradoacademico, String tipoarma, int numcuenta, int edad, int resistencia) {
        this.apodo = apodo;
        this.gradoacademico = gradoacademico;
        this.tipoarma = tipoarma;
        this.numcuenta = numcuenta;
        this.edad = edad;
        this.resistencia = resistencia;
    }

    

    public String getApodo() {
        return apodo;
    }

    public String getGradoacademico() {
        return gradoacademico;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public int getEdad() {
        return edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setGradoacademico(String gradoacademico) {
        this.gradoacademico = gradoacademico;
    }

    public void setTipoarma(String tipoarma) {
        this.tipoarma = tipoarma;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Los Alumnos de Programacion ll{" + "apodo=" + apodo + ", gradoacademico=" + gradoacademico + ", tipoarma=" + tipoarma + ", numcuenta=" + numcuenta + ", edad=" + edad + ", resistencia=" + resistencia + '}';
    }
    
}
