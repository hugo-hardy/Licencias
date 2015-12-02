/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnidad;
import junit.framework.TestCase;
import Entidades.TipoLicencia;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalcularCostoJUnitTest extends TestCase {
    
    public CalcularCostoJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public void testCalcularCosto() {
        
        assertEquals((float) 20, TipoLicencia.calcularCosto("Clase A", 1));
        assertEquals((float) 25, TipoLicencia.calcularCosto("Clase A", 3));
        assertEquals((float) 30, TipoLicencia.calcularCosto("Clase A", 4));
        assertEquals((float) 40, TipoLicencia.calcularCosto("Clase A", 5));
        
        assertEquals((float) 20, TipoLicencia.calcularCosto("Clase B", 1));
        assertEquals((float) 25, TipoLicencia.calcularCosto("Clase B", 3));
        assertEquals((float) 30, TipoLicencia.calcularCosto("Clase B", 4));
        assertEquals((float) 40, TipoLicencia.calcularCosto("Clase B", 5));
        
        assertEquals((float) 23, TipoLicencia.calcularCosto("Clase C", 1));
        assertEquals((float) 30, TipoLicencia.calcularCosto("Clase C", 3));
        assertEquals((float) 35, TipoLicencia.calcularCosto("Clase C", 4));
        assertEquals((float) 47, TipoLicencia.calcularCosto("Clase C", 5));
        
        assertEquals((float) 20, TipoLicencia.calcularCosto("Clase D", 1));
        assertEquals((float) 25, TipoLicencia.calcularCosto("Clase D", 3));
        assertEquals((float) 30, TipoLicencia.calcularCosto("Clase D", 4));
        assertEquals((float) 40, TipoLicencia.calcularCosto("Clase D", 5));
    }
}
