package com.banamex.cajero;

public class CajeroEncapsuladoTest {

	public static void main(String[] args) {
		CajeroEncapsulado cajero001 = new CajeroEncapsulado(1, "Av. Siempre Viva", 325_000);
		CajeroEncapsulado cajero002 = new CajeroEncapsulado(2, "Av. Siempre Viva", 500_000);
		
		System.out.println(cajero001.informacion()); //numSerie = 1000
		System.out.println(cajero002.informacion()); //numSerie = 1001
		

}
}
