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
        Persona instance = new Alumno("", "identificacion", "", "");
        String expResult = "identificacion";
        String result = instance.getIdentificacion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdentificacion() {
        System.out.println("setIdentificacion");
        String identificacion = "identificacion";
        Persona instance = new Alumno("", "identificacion", "", "");
        instance.setIdentificacion(identificacion);
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Alumno("", "", "Aida", "");
        String expResult = "Aida";
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Aida";
        Persona instance = new Alumno("", "", "Aida", "");
        instance.setNombre(nombre);
    }

    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Persona instance = new Alumno("", "", "", "aidarebollo@gmail.com");
        String expResult = "aidarebollo@gmail.com";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "aidarebollo@gmail.com";
        Persona instance = new Alumno("", "", "", "aidarebollo@gmail.com");
        instance.setCorreo(correo);
    }

    @Test
    public void testIdentificacion() {
        System.out.println("identificacion");
        Persona instance = new Alumno("","identificacion", "", "");
        String expResult = "identificacion";
        String result = instance.identificacion();
        assertNotEquals(expResult, result);
    }

    public class PersonaImpl extends Persona {

        public PersonaImpl() {
            super("", "", "");
        }
    }
}
