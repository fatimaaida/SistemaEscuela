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
public class DocenteTest {
    
    public DocenteTest() {
    }
     @Test
    public void testGetProfesion() {
        System.out.println("getProfesion");
        Docente instance = null;
        String expResult = "";
        String result = instance.getProfesion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetProfesion() {
        System.out.println("setProfesion");
        String Profesion = "";
        Docente instance = null;
        instance.setProfesion(Profesion);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Docente instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testIdentificacion() {
        System.out.println("identificacion");
        Docente instance = null;
        String expResult = "";
        String result = instance.identificacion();
        assertEquals(expResult, result);
    }
    
}
