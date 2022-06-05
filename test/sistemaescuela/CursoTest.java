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
public class CursoTest {
    
    public CursoTest() {
    }
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Curso instance = null;
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Curso instance = null;
        instance.setCodigo(codigo);
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Curso instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Curso instance = null;
        instance.setNombre(nombre);
    }

    @Test
    public void testGetHoras() {
        System.out.println("getHoras");
        Curso instance = null;
        int expResult = 0;
        int result = instance.getHoras();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetHoras() {
        System.out.println("setHoras");
        int horas = 0;
        Curso instance = null;
        instance.setHoras(horas);
    }

    @Test
    public void testGetUnDocente() {
        System.out.println("getUnDocente");
        Curso instance = null;
        Docente expResult = null;
        Docente result = instance.getUnDocente();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUnDocente() {
        System.out.println("setUnDocente");
        Docente unDocente = null;
        Curso instance = null;
        instance.setUnDocente(unDocente);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Curso instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result); 
    }
    
    
}
