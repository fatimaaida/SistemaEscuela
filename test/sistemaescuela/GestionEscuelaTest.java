/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sistemaescuela;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class GestionEscuelaTest {
    
    public GestionEscuelaTest() {
    }
    @Test
    public void testAgregarAlumno() {
        System.out.println("agregarAlumno");
        Alumno unAlumno = null;
        GestionEscuela.agregarAlumno(unAlumno);
    }

    @Test
    public void testAgregarDocente() {
        System.out.println("agregarDocente");
        Docente unDocente = null;
        GestionEscuela.agregarDocente(unDocente);
    }

    @Test
    public void testEliminarAlumno() {
        System.out.println("eliminarAlumno");
        int identificacion = 0;
        GestionEscuela.eliminarAlumno(identificacion);
    }

    @Test
    public void testEliminarDocente() {
        System.out.println("eliminarDocente");
        int identificacion = 0;
        GestionEscuela.eliminarDocente(identificacion);
    }

    @Test
    public void testEliminarCurso() {
        System.out.println("eliminarCurso");
        int identificacion = 0;
        GestionEscuela.eliminarCurso(identificacion);
    }

    @Test
    public void testAgregarCurso() {
        System.out.println("agregarCurso");
        Curso unCurso = null;
        GestionEscuela.agregarCurso(unCurso);
    }

    @Test
    public void testAgregarMatricula() {
        System.out.println("agregarMatricula");
        Matricula unaMatricula = null;
        GestionEscuela.agregarMatricula(unaMatricula);
    }

    @Test
    public void testExisteAlumno() {
        System.out.println("existeAlumno");
        String identificacion = "";
        boolean expResult = false;
        boolean result = GestionEscuela.existeAlumno(identificacion);
        assertEquals(expResult, result);
    }

    @Test
    public void testExisteDocente() {
        System.out.println("existeDocente");
        String identificacion = "";
        boolean expResult = false;
        boolean result = GestionEscuela.existeDocente(identificacion);
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlumnoPorIdentificacion() {
        System.out.println("obtenerAlumnoPorIdentificacion");
        String identificacion = "";
        Alumno expResult = null;
        Alumno result = GestionEscuela.obtenerAlumnoPorIdentificacion(identificacion);
        assertEquals(expResult, result);
    }

    @Test
    public void testExisteCurso() {
        System.out.println("existeCurso");
        String codigo = "";
        boolean expResult = false;
        boolean result = GestionEscuela.existeCurso(codigo);
        assertEquals(expResult, result);
    }

    @Test
    public void testEstaMatriculado() {
        System.out.println("estaMatriculado");
        Matricula unaMatricula = null;
        boolean expResult = false;
        boolean result = GestionEscuela.estaMatriculado(unaMatricula);
        assertEquals(expResult, result);
    }

    @Test
    public void testActualizarDocente() {
        System.out.println("actualizarDocente");
        Docente unDocente = null;
        GestionEscuela.actualizarDocente(unDocente);
    }

    @Test
    public void testActualizarCurso() {
        System.out.println("actualizarCurso");
        Curso unCurso = null;
        GestionEscuela.actualizarCurso(unCurso);
    }
}
