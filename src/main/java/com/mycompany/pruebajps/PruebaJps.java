package com.mycompany.pruebajps;

import com.mycompany.pruebajps.logica.Alumno;
import com.mycompany.pruebajps.logica.Carrera;
import com.mycompany.pruebajps.logica.Controladora;
import java.util.Date;

public class PruebaJps {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        
        Carrera carre = new Carrera(1, "Civil");
        
        control.crearCarrera(carre);
        
        
        Alumno alu2 = new Alumno(5, "pepito", "gonzales", new Date(), carre);
        
        /*CREAR UN ALUMNO*/
        control.crearAlumno(alu2);
        
        /*ELIMINAR UN ALUMNO*/
        //control.eliminarAlumno(2);
        
        /*EDITAR UN ALUMNO*/
        //alu.setApellido("Perez");
        //control.editarAlumno(alu);
        
        
        Alumno alu = control.traerAlumno(5);
        System.out.println("-----------------BUSQUEDA INDIVIDUAL-----------------");
        System.out.println("El alumno es: " + alu.toString());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        
        
    }
}
