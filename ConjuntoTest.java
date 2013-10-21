/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LABProyecto;

import static LABProyecto.Conjunto.elementos;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MINERD
 */
public class ConjuntoTest {
    
    public ConjuntoTest() {
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
     * Test of dimension method, of class Conjunto.
     */
    @Test
    public void testDimension() {
        System.out.println("dimension");
        int expResult = 4;
        int result = Conjunto.dimension();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of cardinal method, of class Conjunto.
     */
    @Test
    public void testCardinal() {
        System.out.println("cardinal");
        int expResult = 4;
        int result = Conjunto.cardinal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of union method, of class Conjunto.
     */
    @Test
    public void testUnion() {
        System.out.println("union");
        String elementos[] = {"Esta", "es", "una", "coleccion"};
        Set<String> Parametro = new TreeSet<>(Arrays.asList(elementos));
        Set expResult = new TreeSet<>(Arrays.asList(elementos));
        Set result = Conjunto.union(Parametro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of interseccion method, of class Conjunto.
     */
    @Test
    public void testInterseccion() {
        System.out.println("interseccion");
        String elementos[] = {"Esta", "es", "una", "coleccion"};
        Set<String> Parametro = new TreeSet<>(Arrays.asList(elementos));
        Set expResult = new TreeSet<>(Arrays.asList(elementos));
        Set result = Conjunto.interseccion(Parametro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of diferencia method, of class Conjunto.
     */
    @Test
    public void testDiferencia() {
        System.out.println("diferencia");
        String elementos[] = {"Esta", "es", "una"};
        String Resultado[] = {"coleccion"};
        Set<String> Parametro = new TreeSet<>(Arrays.asList(elementos));
        Set expResult = new TreeSet<>(Arrays.asList(Resultado));
        Set result = Conjunto.diferencia(Parametro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of desplegar method, of class Conjunto.
     */
    @Test
    public void testDesplegar() {
        System.out.println("desplegar");
        Conjunto.desplegar();
        // TODO review the generated test code and remove the default call to fail.
    }
}
