package com.oracle;

public class CajeroAutomaticoConstructorTest {

	public static void main(String[] args) {
		CajeroAutomatico caj11 = new CajeroAutomatico(3456,"Plaza Patio");
		CajeroAutomatico caj13 = new CajeroAutomatico(4412,"Av. Benito Juárez");
		CajeroAutomatico caj22 = new CajeroAutomatico(4412,"Av. Las Palmas");
		System.out.println(caj11.ubicacion);
		
		System.out.println(caj11.imprimirDatosPlaca());
		System.out.println(caj13.imprimirDatosPlaca());
		
		System.out.println("Precio dólar: " + CajeroAutomatico.valorDolar());
		
	}

}
