package mx.generation;

public class VerificarPrimerDigito {
    public String verificar(String texto) {
        char primerCaracter = texto.charAt(0);
        
        if (Character.isDigit(primerCaracter)) {
            return "número";
        } else if (Character.isLetter(primerCaracter)) {
            if (Character.isUpperCase(primerCaracter)) {
                return "mayúscula";
            } else {
                return "minúscula";
            }
        } else {
            return "otro";
        }
    }
}