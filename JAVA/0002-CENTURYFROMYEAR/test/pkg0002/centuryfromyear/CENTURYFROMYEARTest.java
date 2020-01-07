/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0002.centuryfromyear;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EQ-007 ROCIF
 */
public class CENTURYFROMYEARTest {

    @Test
    public void testcenturyFromYear() {
        //Prueba 1
        int resultado = CENTURYFROMYEAR.centuryFromYear(1905);
        int esperado = 20;
        assertEquals(esperado, resultado);
        
        //Prueba 2
        resultado = CENTURYFROMYEAR.centuryFromYear(1700);
        esperado = 17;
        assertEquals(esperado, resultado);
        
        //Prueba 3
        resultado = CENTURYFROMYEAR.centuryFromYear(1988);
        esperado = 20;
        assertEquals(esperado, resultado);
        
        //Prueba 4
        resultado = CENTURYFROMYEAR.centuryFromYear(2000);
        esperado = 20;
        assertEquals(esperado, resultado);
        
        //Prueba 5
        resultado = CENTURYFROMYEAR.centuryFromYear(2001);
        esperado = 21;
        assertEquals(esperado, resultado);
        
        //Prueba 6
        resultado = CENTURYFROMYEAR.centuryFromYear(200);
        esperado = 2;
        assertEquals(esperado, resultado);
        
        //Prueba 7
        resultado = CENTURYFROMYEAR.centuryFromYear(374);
        esperado = 4;
        assertEquals(esperado, resultado);
        
        //Prueba 8
        resultado = CENTURYFROMYEAR.centuryFromYear(45);
        esperado = 1;
        assertEquals(esperado, resultado);
        
        //Prueba 9
        resultado = CENTURYFROMYEAR.centuryFromYear(8);
        esperado = 1;
        assertEquals(esperado, resultado);
    }
    
}
