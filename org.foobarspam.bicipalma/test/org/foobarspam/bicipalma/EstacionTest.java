/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.bicipalma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josep Mesquida
 */
public class EstacionTest {
    
    public EstacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setEstacion method, of class Estacion.
     */
    @Test
    public void testSetEstacion() {
        System.out.println("setEstacion");
        int id = 0;
        String direccion = "";
        int numeroAnclajes = 0;
        Estacion instance = new Estacion();
        instance.setEstacion(id, direccion, numeroAnclajes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacion method, of class Estacion.
     */
    @Test
    public void testGetEstacion() {
        System.out.println("getEstacion");
        Estacion instance = new Estacion();
        int expResult = 0;
        int result = instance.getEstacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarEstacion method, of class Estacion.
     */
    @Test
    public void testConsultarEstacion() {
        System.out.println("consultarEstacion");
        Estacion instance = new Estacion();
        int expResult = 0;
        int result = instance.consultarEstacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anclajesLibres method, of class Estacion.
     */
    @Test
    public void testAnclajesLibres() {
        System.out.println("anclajesLibres");
        Estacion instance = new Estacion();
        int expResult = 0;
        int result = instance.anclajesLibres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarAnclajes method, of class Estacion.
     */
    @Test
    public void testConsultarAnclajes() {
        System.out.println("consultarAnclajes");
        Estacion instance = new Estacion();
        int expResult = 0;
        int result = instance.consultarAnclajes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Estacion.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Estacion instance = new Estacion();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Estacion.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Estacion instance = new Estacion();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroAnclajes method, of class Estacion.
     */
    @Test
    public void testGetNumeroAnclajes() {
        System.out.println("getNumeroAnclajes");
        Estacion instance = new Estacion();
        int expResult = 0;
        int result = instance.getNumeroAnclajes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnclajes method, of class Estacion.
     */
    @Test
    public void testGetAnclajes() {
        System.out.println("getAnclajes");
        Estacion instance = new Estacion();
        int[] expResult = null;
        int[] result = instance.getAnclajes();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anclarBicicleta method, of class Estacion.
     */
    @Test
    public void testAnclarBicicleta() {
        System.out.println("anclarBicicleta");
        Estacion instance = new Estacion();
        instance.anclarBicicleta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarAnclaje method, of class Estacion.
     */
    @Test
    public void testMostrarAnclaje() {
        System.out.println("mostrarAnclaje");
        Estacion instance = new Estacion();
        instance.mostrarAnclaje();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerTargetUsuario method, of class Estacion.
     */
    @Test
    public void testLeerTargetUsuario() {
        System.out.println("leerTargetUsuario");
        Estacion instance = new Estacion();
        instance.leerTargetUsuario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirarBicicleta method, of class Estacion.
     */
    @Test
    public void testRetirarBicicleta() {
        System.out.println("retirarBicicleta");
        Estacion instance = new Estacion();
        instance.retirarBicicleta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarBicicleta method, of class Estacion.
     */
    @Test
    public void testMostrarBicicleta() {
        System.out.println("mostrarBicicleta");
        Estacion instance = new Estacion();
        instance.mostrarBicicleta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarAnclajes method, of class Estacion.
     */
    @Test
    public void testGenerarAnclajes() {
        System.out.println("generarAnclajes");
        Estacion instance = new Estacion();
        int expResult = 0;
        int result = instance.generarAnclajes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
