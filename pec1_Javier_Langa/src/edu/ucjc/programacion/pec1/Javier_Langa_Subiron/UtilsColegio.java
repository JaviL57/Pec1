package edu.ucjc.programacion.pec1.Javier_Langa_Subiron;

import java.util.Scanner;

public class UtilsColegio {
    
    public static Alumno[] crearAlumnos(int numAlumnos) {
        Scanner scanner = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[numAlumnos];
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Introduce los datos del alumno " + (i+1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("DNI: ");
            String dni = scanner.nextLine();
            alumnos[i] = new Alumno(nombre, apellidos, dni);
        }
        scanner.close();
        return alumnos;
    }
}