/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import roma.practico4colegio.Alumno;
import roma.practico4colegio.Materia;
import java.util.HashSet;

/**
 *
 * @author Tomas
 */
public abstract class Datos {
    public static HashSet<Alumno> alumnos = new HashSet<>();
    public static HashSet<Materia> materias = new HashSet<>();

    public static void sample() {
        materias.add(new Materia(2, "Laboratorio 1", "Primero"));
        materias.add(new Materia(1, "Matematica 1", "Primero"));
        alumnos.add(new Alumno(1001, "López", "Martin"));
        alumnos.add(new Alumno(100, "López", "Jose"));
    }
}
