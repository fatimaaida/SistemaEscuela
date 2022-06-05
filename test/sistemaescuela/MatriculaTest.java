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
        Matricula instance = null;
        Curso expResult = null;
        Curso result = instance.getUnCurso();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUnCurso() {
        System.out.println("setUnCurso");
        Curso unCurso = null;
        Matricula instance = null;
        instance.setUnCurso(unCurso);
    }

    @Test
    public void testGetUnAlumno() {
        System.out.println("getUnAlumno");
        Matricula instance = null;
        Alumno expResult = null;
        Alumno result = instance.getUnAlumno();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUnAlumno() {
        System.out.println("setUnAlumno");
        Alumno unAlumno = null;
        Matricula instance = null;
        instance.setUnAlumno(unAlumno);
    }

    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Matricula instance = null;
        Date expResult = null;
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
