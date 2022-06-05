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
public class SistemaEscuelaTest {
    
    public SistemaEscuelaTest() {
    }
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SistemaEscuela.main(args);
    }

    @Test
    public void testExisteAlumno() {
        System.out.println("existeAlumno");
        String text = "";
        boolean expResult = false;
        boolean result = SistemaEscuela.existeAlumno(text);
        assertEquals(expResult, result);
    }

    @Test
    public void testAgregarAlumno() {
        System.out.println("agregarAlumno");
        Alumno unAlumno = null;
        SistemaEscuela.agregarAlumno(unAlumno);
    }
}
