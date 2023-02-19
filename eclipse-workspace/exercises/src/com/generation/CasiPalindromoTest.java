package com.generation;
import org.junit.Test;
import static org.junit.Assert.*;

public class CasiPalindromoTest {

    @Test
    public void testEsCasiPalindromo() {
        assertTrue(CasiPalindromo.esCasiPalindromo("Ver"));
        assertTrue(CasiPalindromo.esCasiPalindromo("Ocho"));
        assertTrue(CasiPalindromo.esCasiPalindromo("Anita lavó la tina"));
        assertFalse(CasiPalindromo.esCasiPalindromo("Oso"));
        assertFalse(CasiPalindromo.esCasiPalindromo("Hola"));
        assertFalse(CasiPalindromo.esCasiPalindromo("veronica"));
    }
}
