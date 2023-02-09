package com.oracle;

import java.util.*;

public class ArrayListConceptos {

	public static void main(String[] args) {
		/**
		 * Una colecci{on List es una colección ORDENADA,
		 * en la que s epermiten elementos duplicados.
		 * 
		 * Se basa en un array redimensionable que crece su
		 * tamaño seg{un crece la colección de elementos.
		 * 
		 * Esta colecci{on es la que mejor rendimiento tiene.
		 * 
		 * Sintaxis:
		 * 
		 * ArrayList<object> varName;
		 */
		
		//Definimos una colección de tipo String.
		ArrayList<String> isbn = new ArrayList<>();
		ArrayList<String> nombreLibros = new ArrayList<>();
		
		//Agregar datos al arrayList con m{etodo add()
		nombreLibros.add("Caperucita Roja"); //El 1er elemento es el indice 0
		nombreLibros.add("Harry Potter");
		nombreLibros.add("El señor de los anillos");
		nombreLibros.add("Quiúbule con...");
		
		//Desplegamos el tamaño de la colección, size()
		int sizeArrayList = nombreLibros.size();
		System.out.println("No. de libros que recomienda Pax: " + sizeArrayList);
		
		//Mostramos el nombre del libro EL señor de los anillos
		//usamos el método get().
		
		System.out.println("Pax recomienda: " + nombreLibros.get(2));
		
		//Removemos un libro del arrayList
		//utilizamos el método remove().
		
		System.out.println("Elemento eliminado: " + nombreLibros.remove(3)); //Removemos Quiúbole con...
		
		nombreLibros.add("El extranjero");
		nombreLibros.add("Un mundo feliz");
		nombreLibros.add("El extranjero"); //elemento duplicado
		nombreLibros.add("Los juegos del hambre");
		
		//Iteramos los elementos de la colección:
		for (int i = 0; i < nombreLibros.size(); i++) {
			System.out.println("Regalamos a la CH22" + nombreLibros.get(i));
			
		}
		
		//For mejorado
		for(String libro : nombreLibros) {
			System.out.println("Para este 14 de febrero lee: " + libro);
		}
		
		//reemplazamos un elemento, método set().
		nombreLibros.set(1, "Nostalgia");
		
		//Iterar con forEach
		nombreLibros.forEach(libro-> System.out.println(libro));


	}

}
