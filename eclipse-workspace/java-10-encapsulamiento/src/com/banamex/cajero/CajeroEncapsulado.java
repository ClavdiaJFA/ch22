package com.banamex.cajero;

public class CajeroEncapsulado {
private int numSerie;
private String ubicacion;
private int numCajero;
private double montoDisponible;

private static int contadorCajero;

static {
	contadorCajero = 1000;
}
CajeroEncapsulado(int numCajero, String ubicacion){
	this.numSerie = contadorCajero++;
	this.numCajero = numCajero;
	this.ubicacion = ubicacion;
	this.montoDisponible = montoDisponible;
}

String informacion() {
	//return "numSerie: " + this.numSerie +
	// return String.format("Serie: %s, Ubicacion: %s", this.numSerie, this.ubicacion);
	StringBuilder strBuilder = new StringBuilder();
	strBuilder.append("Número de serie: ");
	strBuilder.append(this.numSerie);
	strBuilder.append("/n N{umero de cajero: ");
	strBuilder.append(this.numCajero);
	strBuilder.append("/n Ubicación: ");
	strBuilder.append(this.ubicacion);
	strBuilder.append("/n Monto disponible: $ ");
	strBuilder.append(this.montoDisponible);
	strBuilder.append("M.N.");
	
	return strBuilder.toString();
}
}
