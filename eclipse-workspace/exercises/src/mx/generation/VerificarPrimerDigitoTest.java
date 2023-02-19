package mx.generation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VerificarPrimerDigitoTest {
    VerificarPrimerDigito verificador = new VerificarPrimerDigito();

    @Test
    void testNumero() {
        String resultado = verificador.verificar("2 de mis mejores amigos, están en Ch22");
        assertEquals("número", resultado);
    }

    @Test
    void testMayuscula() {
        String resultado = verificador.verificar("Hola Crayoli");
        assertEquals("mayúscula", resultado);
    }

    @Test
    void testMinuscula() {
        String resultado = verificador.verificar("ya tengo hambrita");
        assertEquals("minúscula", resultado);
    }

    @Test
    void testOtro() {
        String resultado = verificador.verificar("#valen1000(base 10)");
        assertEquals("otro", resultado);
    }
}
