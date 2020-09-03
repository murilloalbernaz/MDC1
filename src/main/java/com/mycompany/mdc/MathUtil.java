/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mdc;

import java.util.Objects;

/**
 *
 * @author murillo
 */
public class MathUtil {

    public static int MDC(int a, int b) {
        final boolean primo = ehPrimo(a);
        if(primo){
            if(a % b == 0){
                return a;
            }else{
                return 1;
            }
        }
        if (b > 0 && a % b == 0) {
            return b;
        }
        if (a == b && a > 0) {
            return a;
        }
        
        
        
        return MDC(a-b,b);
    }
    
    public static int MDC(int ...valores){
        Objects.requireNonNull(valores, "O parametro não pode ser nullo");
        if (valores.length == 0) {
            throw new IllegalArgumentException("2 valores é o minimo");
        }
        int a = valores[0];
        for (int b : valores) {
            a = MDC(a,b);
        }
        return a;
    }

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }
}
