package com.oracle;

import java.util.*;

public class HashMapConcepto {

	public static void main(String[] args) {
		/*
		 * Una colecci{on Map, es una relación de llave(key)-valor
		 * que forma una especie de tabla de datos
		 */
		
		//Definimos una colecci{on hashmap
		// <key, value>
		HashMap<Integer, String> estudiantes = new HashMap<>();
		
		//agregamos valores a la colección.
		estudiantes.put(1259, "Juan Verdadero");
		estudiantes.put(2569, "Juan Falso");
		estudiantes.put(5892, "Rafael Encinas");
		estudiantes.put(8592, "Luis Soto de otro universo");
		estudiantes.put(8592, "Luis Soto de nuestro universo"); //Sustituye el anterioir dato, cuando comparten la misma clave
		
		System.out.println(estudiantes);
		
		//Mostramos el dato de la llave indicada
		System.out.println("Mi nuevo mejor amigo es: " + estudiantes.get(1259));
		
		//Removemos un elemento de la colección
		estudiantes.remove(5892);
		System.out.println(estudiantes);
		
		//Iteramos los elementos de la coleccion
		//Iterar sus claves con keySet()
		for (int matricula : estudiantes.keySet()) {
			System.out.println("Matrícula: " + matricula + "-" + estudiantes.get(matricula));
		}
		

	}

}
