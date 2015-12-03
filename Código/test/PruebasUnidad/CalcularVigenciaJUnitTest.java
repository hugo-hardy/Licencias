/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasUnidad;

import Entidades.TipoLicencia;
import junit.framework.TestCase;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;


public class CalcularVigenciaJUnitTest extends TestCase {

    public void CalcularVigenciaJUnitTest() {
    }

//    @BeforeClass
    public static void setUpClass() {
    // Primer Método a Ejecutar cuando se
        // lancen los Test
    }

//    @AfterClass
    public static void tearDownClass() {
    // Método que se ejecuta cuando se terminan los test
        // Es útil para cerrar bases de datos, archivos,
        // Exploradores, Streams, etc.
    }

//    @Before
    public void setUp() {
        // Clase q se va a utilizar para setear los datos a
        // todos los objetos que necesitemos, es el inicializador
        // Tal cual el initComponents del NetBeans
    }

//    @After
    public void tearDown() {
        // Último método que se ejecuta cuando se terminan los test
        // Es útil para cerrar bases de datos, archivos,
        // Exploradores, Streams, etc.
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public void testCalcularVigencia() {

        TipoLicencia prueba = new TipoLicencia();
        
        assertEquals((Integer) 1, prueba.calcularVigencia(17, true));
        assertEquals((Integer) 3, prueba.calcularVigencia(17, false));
        assertEquals((Integer) 5, prueba.calcularVigencia(22, false));
        assertEquals((Integer) 5, prueba.calcularVigencia(46, false));
        assertEquals((Integer) 4, prueba.calcularVigencia(47, false));
        assertEquals((Integer) 4, prueba.calcularVigencia(60, false));
        assertEquals((Integer) 3, prueba.calcularVigencia(61, false));
        assertEquals((Integer) 3, prueba.calcularVigencia(70, false));
        assertEquals((Integer) 1, prueba.calcularVigencia(71, false));
        
    }
}
