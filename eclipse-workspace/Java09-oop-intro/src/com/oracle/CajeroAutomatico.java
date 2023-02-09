package com.oracle;

public class CajeroAutomatico {
	//atributos de instancia
	int numSerie;
	String ubicacion;
	double cantidadDisponible;
	//BandejaDinero bandejaDinero;
	int numMovimientos;
	
	//atributo de clase
	static String nombreBanco;
	
	//Inicialización de atributos de instancia
	{
		numSerie = 0;
		//ubicacion = "desconocida";
		cantidadDisponible = 0.0;
		numMovimientos = 0;
	}
	
	//Inicialización de atributos de clase
	static {
		nombreBanco = "PaxnaMex";
	}
	
	//Métodos constructores
	//EL método constructor no contiene el tipo de retorno
	//debe tener el mismo nombre de la clase
	//Un constructor vacío se llama, método constructor por default
	//Si usamos un constructor con parámetros, el constructor
	//por default ya no lo genera el compilador
	CajeroAutomatico(int numSerieCajero, String ubicacion){
		numSerie = numSerieCajero;
		this.ubicacion = ubicacion;
		//System.out.println("Se crea un nuevo cajero");
	}
	
	//Constructor por default
	public CajeroAutomatico() {
	
	}
	
	//Métodos de instancia
	static double valorDolar() {
		//ToDo obtener el valor del dólar
		// Un método estático no pued etener acceso a
		//los atriobutos y método de instancia, ya que
		//en el diseño de la clase, a{un no existen objetos.
		//Los objetos van a existir en la implementación
		//de la clase
		//int cantidad = this.cantidadDisponible;
		return 19.12;
	}
	
	String imprimirDatosPlaca() {
		return this.numSerie + "\t" + this.ubicacion + "\t" + this.cantidadDisponible;
	}
}

/*
public class CajeroAutomatico {
    //fields (atributos de instancia)
	
	//static fields (atributos de clase)
	
	//bloque de incialización de atributos de instancia
	
	//bloque de incialización de atributos de clase
	
	//Métodos constructores
	
	//Método de instancia
	
	//Métodos de clase (statics)

}
*/