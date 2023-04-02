package edu.ucjc.programacion.pec1.Javier_Langa_Subiron;

import java.util.Scanner;

import edu.ucjc.programacion.pec1.Javier_Langa_Subiron.UtilsColegio;
import edu.ucjc.programacion.pec1.Javier_Langa_Subiron.Colegio;
import edu.ucjc.programacion.pec1.Javier_Langa_Subiron.Alumno;

public class GestionColegios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos los datos del colegio
        System.out.print("Introduce el nombre del colegio: ");
        String nombreColegio = scanner.nextLine();

        System.out.print("Introduce la dirección del colegio: ");
        String direccionColegio = scanner.nextLine();

        System.out.print("Introduce el número de aulas del colegio: ");
        int numAulas = scanner.nextInt();

        Colegio colegio = new Colegio(nombreColegio, direccionColegio, numAulas);

        // Pedimos los datos de los alumnos
        System.out.print("Introduce el número de alumnos: ");
        int numAlumnos = scanner.nextInt();

        Alumno[] alumnos = UtilsColegio.crearAlumnos(numAlumnos);

        // Asignamos a cada alumno al primer asiento libre que encuentre en el colegio
        for (Alumno alumno : alumnos) {
            boolean asignado = false;
            for (Aula aula : colegio.getAulas()) {
                if (aula.asignarAsiento(alumno)) {
                    System.out.println("El alumno " + alumno.getNombre() + " " + alumno.getApellidos() + " con DNI " + alumno.getDni() +
                            " ha sido asignado al asiento " + aula.getUltimoAsientoAsignado() +
                            " del aula " + aula.getNumero() + " de la planta " + aula.getPlanta());
                    asignado = true;
                    break;
                }
            }
            if (!asignado) {
                System.out.println("No queda sitio para el alumno " + alumno.getNombre() + " " +alumno.getApellidos() + " con DNI " + alumno.getDni());
            }
        }
    }
}