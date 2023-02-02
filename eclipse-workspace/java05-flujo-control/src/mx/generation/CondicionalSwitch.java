package mx.generation;
import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		
		//Compar números de punto flotante
		//Se debe evitar realizar las operaciones con este tipo de datos
		double tasaInteres = 84.1;
		double interesEstatal = 0.2;
		double interesTotal = (tasaInteres * 100 + interesEstatal * 100) / 100;

		System.out.println(interesTotal);
		
		if (interesTotal == 0.3)
			System.out.println("Interés al 84.3% está leve");
		else
			System.out.println("Aplicar nuevos intereses");
		
		/**
		 * Sintaxis de condicional Switch
		 * 
		 * switch(expresión){
		 *   case valor1: instrucciones;
		 *                break;
		 *   case valorN: instrucciones;
		 *                break;
		 *   default: instrucciones;
		 *            break;
		 * }
		 * 
		 * La expresión debe ser de tipo entero, string o enum.
		 * 
		 */
		
		Scanner leerTeclado = new Scanner(System.in);
		System.out.println("****Mes en curso****");
		System.out.println("Introduce el mes en curso (1-12): ");
		if(leerTeclado.hasNextInt()) {
			String mesTxt = "";
			int mesEnCurso = leerTeclado.nextInt();
		//Switch para encontrar el mes
		switch(mesEnCurso) {
		case 1 : mesTxt = "enero";
		           break;
		case 2 : mesTxt = "febrero";
                   break;
		case 3 : mesTxt = "marzo";
                   break;
		case 4 : mesTxt = "abril";
		           break;
		case 5 : mesTxt = "mayo";
		           break;
		case 6 : mesTxt = "junio";
		           break;
		case 7 : mesTxt = "julio";
		           break;
		case 8 : mesTxt = "agosto";
		           break;
		case 9 : mesTxt = "septiembre";
		           break;
		case 10 : mesTxt = "octubre";
		           break;
		case 11 : mesTxt = "noviembre";
		           break;
		case 12 : mesTxt = "diciembre";
                   break;
		}
		
		//Switch para encontrar la estación
		String estacion = "";
		switch(mesTxt.toLowerCase()) {
		case "marzo" : 
		case "abril" : 
		case "mayo" : estacion = "primavera";
		           break;
		case "junio" : 
		case "julio" : 
		case "agosto" : estacion = "verano";
	               break;
		case "septiembre" : 
		case "octubre" : 
		case "noviembre" : estacion = "otoño";
	               break;
		case "diciembre" : 
		case "enero" : 
		case "febrero" : estacion = "invierno";
	               break;
		}
		
		System.out.println("Te encuentras en el mes de: " + mesTxt + " y en la estación de: " + estacion);
		} else {
			System.out.println("Valor desconocido. Hasta luego");
		}

		leerTeclado.nextLine();
		leerTeclado.close();

	}

}
