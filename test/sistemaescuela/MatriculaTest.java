/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sistemaescuela;

import java.util.Date;
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
public class MatriculaTest {
    
    public MatriculaTest() {
    }
    
    @Test
    public void testGetUnCurso() {
        System.out.println("getUnCurso");
        Matricula instance = new Matricula ("progra", "", "");
        Curso expResult = "progra";
        Curso result = instance.getUnCurso();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUnCurso() {
        System.out.println("setUnCurso");
        Curso unCurso = new Matricula ("progra", "", "");
        Matricula instance = "progra";
        instance.setUnCurso(unCurso);
    }

    @Test
    public void testGetUnAlumno() {
        System.out.println("getUnAlumno");
        Matricula instance =new Matricula ("", "Mario", "");
        Alumno expResult = "Mario";
        Alumno result = instance.getUnAlumno();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUnAlumno() {
        System.out.println("setUnAlumno");
        Alumno unAlumno = new Matricula ("", "Mario", "");
        Matricula instance = "Mario";
        instance.setUnAlumno(unAlumno);
    }

    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Matricula instance = new Matricula ("", "", "", "Fecha");
        Date expResult = "Fecha";
        Date result = instance.getFecha();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Matricula instance = null;
        instance.setFecha(fecha);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Matricula instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
