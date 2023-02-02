package mx.generation;

import java.util.Scanner;

public class FlujoControl {

	public static void main(String[] args) {
		/*
		 * Sintaxis de la condicional if
		 * 
		 * if(condición) instrucción_si_condición_es_true;
		 * 
		 * -------------------
		 * 
		 * if(condición){
		 *   instrucciones si la condición es true;
		 * }
		 * 
		 * ---------------------------------
		 * 
		 * if(condición){
		 *   instrucciones si la condición es true;
		 * }else{
		 *    Instrucciones si la condición es false
		 * }
		 * 
		 * -----------------------------------
		 * 
		 * if(condición){
		 *   instrucciones si la condición es true;
		 * }else if (nueva condición){
		 *    Instrucciones si la nueva_condición es true:
		 * }else{
		 *    Instrucciones si las anteriores condiciones son false;
		 * }
		 * */
		
		boolean condicion = false;
		
		System.out.println("Java 05");
		
		//if (condicion) System.out.println("La condición es verdadera");
		
		if (condicion) System.out.println("La variable condición fue true");
		else System.out.println("La variable condición fue false");
		
		int numeroEdoCuenta = 125668;
		
		if (numeroEdoCuenta < 1000) {
			System.out.println("El cliente es antiguo");
		} else {
			System.out.println("El cliente es nuevo");
		}
		
		//De una variable tipo int, se evalúe si está en el rango
		//del 1 al 10. De ser así, desplegar "La selección está en rango"
		//en caso contrario "la selección está fuera de rango"
		
		int num = 12;
		if (num >= 1 && num <= 10) {
		  System.out.println("La selección está en rango");
		} else {
		  System.out.println("La selección está fuera de rango");
		}
		
		//Operador TERNARIO 
		// Sintaxis: expresion ? si_es_true : si_es_false;
		//Es un condicional simplificado.
		String respuesta = (num >= 1 && num <= 10)? 
				"La selección está en rango":
				"La selección está fuera de rango";
		System.out.println(respuesta);
		
		//Clase Scanner
		//Nos permite realizar una lectura de la consola
		//Para utilizarla, hay que importar la clase del
		//paquete java.util
		
		int myAge = 0;
		String buffer = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		String myName = sc.nextLine(); //Leer una línea hasta que se encuentre /n
		
		System.out.println("Dime tu edad: ");                          
		if (sc.hasNextInt() ) {
		  myAge = sc.nextInt(); //Leer un dato de tipo int
		  sc.nextLine();
		}
		//else
			//sc.nextLine(); //Leemos lo que está en el buffer
		System.out.println("Dime tu apellido ");
		String myLastName = sc.nextLine();
		
		System.out.println("Holi "+ myName + "de edad " + myAge + "años");
		System.out.println("Con apellido: " + myLastName);
		
		
		/**
         * El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
         * El usuario proporcionará un valor entre 0 y 10 (usando Scanner). 
         * Si está entre 9 y 10: imprimir una A S
         * Si está entre 8 y menor a 9: imprimir una B 
         * Si está entre 7 y menor a 8: imprimir una C 
         * Si está entre 6 y menor a 7: imprimir una D 
         * Si está entre 0 y menor a 6: imprimir una F 
         * Cualquier otro valor debe imprimir: Valor desconocido.
         */
		Scanner scn = new Scanner(System.in);
        System.out.println("Introduce un valor entre 0 y 10: ");
        int nota = scn.nextInt();

        if (nota >= 9 && nota <= 10) {
            System.out.println("A");
        } else if (nota >= 8 && nota < 9) {
            System.out.println("B");
        } else if (nota >= 7 && nota < 8) {
            System.out.println("C");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("D");
        } else if (nota >= 0 && nota < 6) {
            System.out.println("F");
        } else {
            System.out.println("Valor desconocido");
        }
	
	}

}
