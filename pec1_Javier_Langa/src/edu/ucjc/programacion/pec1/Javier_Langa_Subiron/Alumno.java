package edu.ucjc.programacion.pec1.Javier_Langa_Subiron;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String dni;

    public Alumno(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }
}



