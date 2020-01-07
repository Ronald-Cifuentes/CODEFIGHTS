/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0001.add;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EQ-007 ROCIF
 */
public class ADDTest {

    @Test
    public void testADD() {
        
        //Prueba 1
        int resultado = ADD.ADD(1, 2);
        int esperado = 3;
        assertEquals(esperado, resultado);
        
        //Prueba 2
        resultado = ADD.ADD(0, 1000);
        esperado = 1000;
        assertEquals(esperado, resultado);
        
        //Prueba 3
        resultado = ADD.ADD(2, -39);
        esperado = -37;
        assertEquals(esperado, resultado);
        
        //Prueba 4
        resultado = ADD.ADD(99, 100);
        esperado = 199;
        assertEquals(esperado, resultado);
        
        //Prueba 5
        resultado = ADD.ADD(-100, 100);
        esperado = 0;
        assertEquals(esperado, resultado);
        
        //Prueba 6
        resultado = ADD.ADD(-1000, -1000);
        esperado = -2000;
        assertEquals(esperado, resultado);
        
    }
    
}
