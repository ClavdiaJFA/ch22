package mx.generation;

public class FuncionesMain {

    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2; 
        double suma = ( (a*100)  +  (b*100) )/100.0;
        imprimir( formatoResultado(suma) );
        // String sumaTxt = formatoResultado(suma);
        // imprimir( sumaTxt );
                
        a = 12.1;
        b = 34.213;
        suma = ( (a*100)  +  (b*100) )/100.0;
        
        //String resultado = String.format("Resultado %6.3f%n", suma );//00.000 son 6 dígitos
        // En una función estática, solo podemos usar otras funciones estáticas
        //imprimir(resultado);// Para invocar a la función imprimir;
        imprimir( formatoResultado(suma) );

    }
    
    // tipo_retorno nombre_función( parámetros ){ //firma de la función
    //
    // }
    static void imprimir( String texto ){ // con void indicamos que la función no tiene retorno
        System.out.println(" -> " + texto);
    }
    
    static String formatoResultado( double resultado ) { //retornamos un string
        String txt = String.format("Resultado %6.3f%n", resultado );
        return txt;
        //return String.format("Resultado %6.3f%n", resultado );
    }
    

}