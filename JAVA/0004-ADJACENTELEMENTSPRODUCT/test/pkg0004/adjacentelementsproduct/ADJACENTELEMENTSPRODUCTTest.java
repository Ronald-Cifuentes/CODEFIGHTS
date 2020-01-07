/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0004.adjacentelementsproduct;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EQ-007 ROCIF
 */
public class ADJACENTELEMENTSPRODUCTTest {

    @Test
    public void testAdjacentElementsProduct() {
        //Prueba 1
        int parametro[] = {3, 6, -2, -5, 7, 3};
        int salida = ADJACENTELEMENTSPRODUCT.adjacentElementsProduct(parametro);
        int esperado = 21;
        assertEquals(esperado, salida);
        
        //Prueba 2
        parametro = new int[]{-1, -2};
        salida = ADJACENTELEMENTSPRODUCT.adjacentElementsProduct(parametro);
        esperado = 2;
        assertEquals(esperado, salida);
        
        //Prueba 3
        parametro = new int[]{5, 1, 2, 3, 1, 4};
        salida = ADJACENTELEMENTSPRODUCT.adjacentElementsProduct(parametro);
        esperado = 6;
        assertEquals(esperado, salida);
        
        //Prueba 4
        parametro = new int[]{1, 2, 3, 0};
        salida = ADJACENTELEMENTSPRODUCT.adjacentElementsProduct(parametro);
        esperado = 6;
        assertEquals(esperado, salida);
        
        //Prueba 5
        parametro = new int[]{9, 5, 10, 2, 24, -1, -48};
        salida = ADJACENTELEMENTSPRODUCT.adjacentElementsProduct(parametro);
        esperado = 50;
        assertEquals(esperado, salida);
        
        //Prueba 6
        parametro = new int[]{5, 6, -4, 2, 3, 2, -23};
        salida = ADJACENTELEMENTSPRODUCT.adjacentElementsProduct(parametro);
        esperado = 30;
        assertEquals(esperado, salida);
        
        //Prueba 7
        parametro = new int[]{4, 1, 2, 3, 1, 5};
        salida = ADJACENTELEMENTSPRODUCT.adjacentElementsProduct(parametro);
        esperado = 6;
        assertEquals(esperado, salida);
        
        //Prueba 8
        parametro = new int[]{-23, 4, -3, 8, -12};
        salida = ADJACENTELEMENTSPRODUCT.adjacentElementsProduct(parametro);
        esperado = -12;
        assertEquals(esperado, salida);
        
        //Prueba 9
        parametro = new int[]{1, 0, 1, 0, 1000};
        salida = ADJACENTELEMENTSPRODUCT.adjacentElementsProduct(parametro);
        esperado = 0;
        assertEquals(esperado, salida);
    }
    
}
