package com.generation;

public class CasiPalindromo {

    public static boolean esCasiPalindromo(String palabra) {
        palabra = palabra.toLowerCase();
        int n = palabra.length();
        int cambios = 0;
        for (int i = 0; i < n / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(n - i - 1)) {
                cambios++;
            }
            if (cambios > 1) {
                return false;
            }
        }
        return true;
    }
}
