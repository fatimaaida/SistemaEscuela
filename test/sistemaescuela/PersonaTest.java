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
public class PersonaTest {
    
    public PersonaTest() {
    }
    @Test
    public void testGetIdentificacion() {
        System.out.println("getIdentificacion");
        Persona instance = null;
        String expResult = "";
        String result = instance.getIdentificacion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdentificacion() {
        System.out.println("setIdentificacion");
        String identificacion = "";
        Persona instance = null;
        instance.setIdentificacion(identificacion);
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = null;
        instance.setNombre(nombre);
    }

    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Persona instance = null;
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Persona instance = null;
        instance.setCorreo(correo);
    }

    @Test
    public void testIdentificacion() {
        System.out.println("identificacion");
        Persona instance = null;
        String expResult = "";
        String result = instance.identificacion();
        assertEquals(expResult, result);
    }

    public class PersonaImpl extends Persona {

        public PersonaImpl() {
            super("", "", "");
        }
    }
}
