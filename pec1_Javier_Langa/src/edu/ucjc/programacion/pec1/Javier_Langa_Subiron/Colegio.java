package edu.ucjc.programacion.pec1.Javier_Langa_Subiron;

public class Colegio {
    private String nombre;
    private String direccion;
    private Aula[] aulas;

    public Colegio(String nombre, String direccion, int numAulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.aulas = new Aula[numAulas];
        for (int i = 0; i < numAulas; i++) {
            this.aulas[i] = new Aula(i + 1, 1);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Aula[] getAulas() {
        return aulas;
    }
}