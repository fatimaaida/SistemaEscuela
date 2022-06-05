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
public class AlumnoTest {
    
    public AlumnoTest() {
    }

    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Alumno instance = new Alumno("Femenino","","","");
        String expResult = "Femenino";
        String result = instance.getGenero();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        String Genero = "Femenino";
        Alumno instance = new Alumno(Genero, "", "","");
        instance.setGenero(Genero);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Alumno instance = new Alumno("","","Nestor","");
        String expResult = "Nestor";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testIdentificacion() {
        System.out.println("identificacion");
        Alumno instance = new Alumno("Genero", "identificacion", "nombre", "correo");
        String expResult = "identificacion";
        String result = instance.identificacion();
        assertNotEquals(expResult, result);
    }
    
}
