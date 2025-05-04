package com.mycompany.pruebajps;

import com.mycompany.pruebajps.logica.Alumno;
import com.mycompany.pruebajps.logica.Carrera;
import com.mycompany.pruebajps.logica.Controladora;
import com.mycompany.pruebajps.logica.Materia;
import java.util.Date;
import java.util.LinkedList;

public class PruebaJps {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
        Carrera carre = new Carrera(1, "Sistemas", listaMaterias);
        control.crearCarrera(carre);
        
        //Crear materias
        Materia mate1 = new Materia(1,"Matematica", "Cuatrimestral", carre);
        Materia mate2 = new Materia(2,"Lengua", "Bimestral", carre);
        Materia mate3 = new Materia(1,"Ingles", "Anual", carre);
        
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Crear arreglo de materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
        
        //Crear un alumno
        Alumno alu = new Alumno(1, "cachi", "galiano", new Date(), carre);
        control.crearAlumno(alu);
        
        /*ELIMINAR UN ALUMNO*/
        //control.eliminarAlumno(2);
        
        /*EDITAR UN ALUMNO*/
        //alu.setApellido("Perez");
        //control.editarAlumno(alu);
        
        
        Alumno alu2 = control.traerAlumno(1);
        System.out.println("-----------------BUSQUEDA INDIVIDUAL-----------------");
        System.out.println("El alumno es: " + alu.toString());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        
        
    }
}
