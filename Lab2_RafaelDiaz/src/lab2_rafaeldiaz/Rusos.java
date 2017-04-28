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

    public Rusos(String nombre, String rango, String arma, int ID, int edad, int resistencia) {
        this.nombre = nombre;
        this.rango = rango;
        this.arma = arma;
        this.ID = ID;
        this.edad = edad;
        this.resistencia = resistencia;
    }

    

    

    public String getNombre() {
        return nombre;
    }

    public String getRango() {
        return rango;
    }

    public String getArma() {
        return arma;
    }

    public int getID() {
        return ID;
    }

    public int getEdad() {
        return edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Rusos{" + "nombre=" + nombre + ", rango=" + rango + ", arma=" + arma + ", ID=" + ID + ", edad=" + edad + ", resistencia=" + resistencia + '}';
    }
    
    
}
