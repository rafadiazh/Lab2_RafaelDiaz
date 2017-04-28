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

    public String getAlias() {
        return alias;
    }

    public String getCasta() {
        return casta;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public int getEdad() {
        return edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setCasta(String casta) {
        this.casta = casta;
    }

    public void setTipoarma(String tipoarma) {
        this.tipoarma = tipoarma;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Alemanes{" + "alias=" + alias + ", casta=" + casta + ", tipoarma=" + tipoarma + ", edad=" + edad + ", resistencia=" + resistencia + '}';
    }
    
}
