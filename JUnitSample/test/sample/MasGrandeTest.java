/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of max method, of class MasGrande.
     */
    /*
    @Test
    public void testMax() {
        System.out.println("max");
        int[] a = null;
        int expResult = 0;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    @Test
    public void TestMaxCardinalidad(){
        System.out.println("* MasGrandeTest: TestMaxCardinalidad()");
        int[] a = {1, 2};
        int expResult = 2;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestMaxOrden(){
        System.out.println("* MasGrandeTest: TestMaxOrden()");
        int[] a = {-7, -25, -145, -87, -10, -5};
        int expResult = -5;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    @Test 
    public void TestMaxRango(){
        System.out.println("* MasGrandeTest: TestMaxRango()");
        int[] a ={-2147483648, 5487254, 2147483647};
        int expResult = 2147483647;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    @Test 
    public void TestMaxReferencia(){
        System.out.println("* MasGrandeTest: TestMaxReferencia()");
        int[] a ={'/', 254, -25};
        int expResult = 254;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestMaxExistencia(){
        System.out.println("* MasGrandeTest: TestMaxExistencia()");
        int[] a = {0};
        int expResult = 0;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    @Test (timeout = 1000)
    public void TestMaxTiempo(){
        System.out.println("* MasGrandeTest: TestMaxTiempo()");
        int[] a = {-15872, 587452, 125, 548452, -968542, 521234, 4512414, -87, 568712275};
        int expResult = 568712275;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
}
