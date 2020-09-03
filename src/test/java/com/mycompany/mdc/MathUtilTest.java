/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mdc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author murillo
 */
public class MathUtilTest {
    

    @Test
    public void testMDCPar() {
        final int a = 6;
        final int b = 3;
        final int esperado = 3;
        final int obtido = MathUtil.MDC(a,b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMDCImpar(){
        final int a = 9;
        final int b = 3;
        final int esperado = 3;
        final int obtido = MathUtil.MDC(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMDCAA(){
        final int a = 8;
        final int b = 8;
        final int esperado = a;
        final int obtido = MathUtil.MDC(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMDCSOciativo(){
        final int a = 8;
        final int b = 4;
        final int c = 2;
        boolean resultado = false;
        final boolean esperado = true;
        final int obtido1 = MathUtil.MDC(a, MathUtil.MDC(b, c));
        final int obtido2 = MathUtil.MDC(MathUtil.MDC(a, b),c);
        final int obtido3 = MathUtil.MDC(b, MathUtil.MDC(a, c));
        if(obtido1 == obtido2 && obtido2 == obtido3){
            resultado = true;
        }
            assertEquals(esperado, resultado);
    }
    
    @Test
    void testMDCPrimo(){
        final int a = 7;
        final int b = 2;
        final int esperado = 1;
        final int obtido = MathUtil.MDC(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void Testmdcmutiplovalores(){
        final int a = 30;
        final int b = 12;
        final int c = 4;
        final int esperado = 2;
        final int obtido = MathUtil.MDC(a,b,c);
    }
    
    @Test
    void valorNenhum(){
        assertThrows(IllegalArgumentException.class,  () -> MathUtil.MDC());
    
    }
    
    @Test
    void nulo(){
        assertThrows(NullPointerException.class, () -> MathUtil.MDC(null));
    }
}

