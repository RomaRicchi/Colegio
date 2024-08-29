/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package roma.practico4colegio;
import View.Datos;
import View.MenuColegio;
/**
 *
 * @author Tomas
 */
public class Practico4Colegio {

    public static void main(String[] args) {
           
        Materia InglesI = new Materia(1, "Ingles I", "Primero");
        Materia Laboratorio1 = new Materia(2, "Laboratorio 1", "Primero");
        Materia Matematicas = new Materia(3, "Matematicas", "Primero");
        
        Alumno a1= new Alumno( 1001, "López", "Martin");
        Alumno a2= new Alumno( 1002, "Martínez", "Brenda");
        
        a1.agregarMateria(InglesI);
        a1.agregarMateria(Matematicas);
        a1.agregarMateria(Laboratorio1);

        // 4. Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1
        a2.agregarMateria(InglesI);
        a2.agregarMateria(Matematicas);
        a2.agregarMateria(Laboratorio1);
        a2.agregarMateria(Laboratorio1);
    
        
        System.out.println("López está inscripto en " + a1.cantidadMaterias() + " materias.");
        System.out.println("Martínez está inscripto en " + a2.cantidadMaterias() + " materias.");
        Datos.sample();
        MenuColegio app = new MenuColegio();
        app.setVisible(true);
    }
    
}
