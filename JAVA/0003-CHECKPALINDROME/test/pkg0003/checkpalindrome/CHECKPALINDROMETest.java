/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0003.checkpalindrome;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EQ-007 ROCIF
 */
public class CHECKPALINDROMETest {
    
    @Test
    public void testCheckPalindrome() {
        //Prueba 1
        boolean resultado = CHECKPALINDROME.checkPalindrome("aabaa");
        boolean esperado = true;
        assertEquals(esperado, resultado);
        
        //Prueba 2
        resultado = CHECKPALINDROME.checkPalindrome("abac");
        esperado = false;
        assertEquals(esperado, resultado);
        
        //Prueba 3
        resultado = CHECKPALINDROME.checkPalindrome("a");
        esperado = true;
        assertEquals(esperado, resultado);
        
        //Prueba 4
        resultado = CHECKPALINDROME.checkPalindrome("az");
        esperado = false;
        assertEquals(esperado, resultado);
        
        //Prueba 5
        resultado = CHECKPALINDROME.checkPalindrome("abacaba");
        esperado = true;
        assertEquals(esperado, resultado);
        
        //Prueba 6
        resultado = CHECKPALINDROME.checkPalindrome("z");
        esperado = true;
        assertEquals(esperado, resultado);
        
        //Prueba 7
        resultado = CHECKPALINDROME.checkPalindrome("aaabaaaa");
        esperado = false;
        assertEquals(esperado, resultado);
        
        //Prueba 8
        resultado = CHECKPALINDROME.checkPalindrome("zzzazzazz");
        esperado = false;
        assertEquals(esperado, resultado);
        
        //Prueba 9
        resultado = CHECKPALINDROME.checkPalindrome("hlbeeykoqqqqokyeeblh");
        esperado = true;
        assertEquals(esperado, resultado);
        
        //Prueba 10
        resultado = CHECKPALINDROME.checkPalindrome("hlbeeykoqqqokyeeblh");
        esperado = true;
        assertEquals(esperado, resultado);
        
    }
    
}
