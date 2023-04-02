package edu.ucjc.programacion.pec1.Javier_Langa_Subiron;

public class Aula {
    private int numero;
    private int planta;
    private Alumno[] asientos;
    private int ultimoAsientoAsignado;

    public Aula(int numero, int planta) {
        this.numero = numero;
        this.planta = planta;
        this.asientos = new Alumno[3];
        this.ultimoAsientoAsignado = 0;
     
    }
    
    public int getUltimoAsientoAsignado() {
        return this.ultimoAsientoAsignado;
    }

    public int getNumero() {
        return numero;
    }

    public int getPlanta() {
        return planta;
    }

    public boolean asignarAsiento(Alumno alumno) {
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == null) {
                asientos[i] = alumno;
                this.ultimoAsientoAsignado = i + 1;
                return true;
            }
        }
        return false;
    }
}
