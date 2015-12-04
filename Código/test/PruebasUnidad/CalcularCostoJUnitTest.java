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
        double v20 = 20, v25 = 25, v30 = 30, v40 = 40, v23 = 23, v35 = 35, v47 = 47;
        double v29 = 29, v39 = 39, v44 = 44, v59 = 59;
        
        assertEquals(v20, TipoLicencia.calcularCosto("Clase A", 1));
        assertEquals(v25, TipoLicencia.calcularCosto("Clase A", 3));
        assertEquals(v30, TipoLicencia.calcularCosto("Clase A", 4));
        assertEquals(v40, TipoLicencia.calcularCosto("Clase A", 5));
        
        assertEquals(v20, TipoLicencia.calcularCosto("Clase B", 1));
        assertEquals(v25, TipoLicencia.calcularCosto("Clase B", 3));
        assertEquals(v30, TipoLicencia.calcularCosto("Clase B", 4));
        assertEquals(v40, TipoLicencia.calcularCosto("Clase B", 5));
        
        assertEquals(v23, TipoLicencia.calcularCosto("Clase C", 1));
        assertEquals(v30, TipoLicencia.calcularCosto("Clase C", 3));
        assertEquals(v35, TipoLicencia.calcularCosto("Clase C", 4));
        assertEquals(v47, TipoLicencia.calcularCosto("Clase C", 5));
        
        assertEquals(v20, TipoLicencia.calcularCosto("Clase D", 1));
        assertEquals(v25, TipoLicencia.calcularCosto("Clase D", 3));
        assertEquals(v30, TipoLicencia.calcularCosto("Clase D", 4));
        assertEquals(v40, TipoLicencia.calcularCosto("Clase D", 5));
        
        assertEquals(v29, TipoLicencia.calcularCosto("Clase E", 1));
        assertEquals(v39, TipoLicencia.calcularCosto("Clase E", 3));
        assertEquals(v44, TipoLicencia.calcularCosto("Clase E", 4));
        assertEquals(v59, TipoLicencia.calcularCosto("Clase E", 5));
        
        assertEquals(v20, TipoLicencia.calcularCosto("Clase F", 1));
        assertEquals(v25, TipoLicencia.calcularCosto("Clase F", 3));
        assertEquals(v30, TipoLicencia.calcularCosto("Clase F", 4));
        assertEquals(v40, TipoLicencia.calcularCosto("Clase F", 5));
        
        assertEquals(v20, TipoLicencia.calcularCosto("Clase G", 1));
        assertEquals(v25, TipoLicencia.calcularCosto("Clase G", 3));
        assertEquals(v30, TipoLicencia.calcularCosto("Clase G", 4));
        assertEquals(v40, TipoLicencia.calcularCosto("Clase G", 5));
    }
}
