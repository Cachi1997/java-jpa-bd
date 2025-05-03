package com.mycompany.pruebajps;

import com.mycompany.pruebajps.logica.Alumno;
import com.mycompany.pruebajps.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

public class PruebaJps {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        Alumno alu2 = new Alumno(25, "pablo", "pavez", new Date());
        
        /*CREAR UN ALUMNO*/
        control.crearAlumno(alu2);
        
        /*ELIMINAR UN ALUMNO*/
        //control.eliminarAlumno(2);
        
        /*EDITAR UN ALUMNO*/
        //alu.setApellido("Perez");
        //control.editarAlumno(alu);
        
        
        Alumno alu = control.traerAlumno(3);
        System.out.println("-----------------BUSQUEDA INDIVIDUAL-----------------");
        System.out.println("El alumno es: " + alu.toString());
        
        System.out.println("-----------------BUSQUEDA DE TODOS-------------------");
        
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        
        for(Alumno a : listaAlumnos){
            System.out.println("El alumno es: " + a.toString());
        }
        System.out.println("------------------------------------------------------");
    }
}
