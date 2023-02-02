package mx.generation;

public class variables {

	public static void main(String[] args) {
		/*
		 * En Java existen 8 datos primitivos
		 * -byte: tipo númerico de 8 bits
		 * -short: tipo númerico de 16 bits
		 * -int: numérico de 32 bits
		 * -long: numérico de 64 bits
		 * -float: numérico de punto flotante de 32 bits
		 * -double: numérico de punto flotante de 64 bits
		 * -boolean: dato booleano (true, false)
		 * -char: caracter
		 * */

		//Definimos una variable de tipo byte
		byte variableTipoByte = 10;
		System.out.println("Byte: " + variableTipoByte);
		System.out.println("Max byte value: " + Byte.MAX_VALUE);
		System.out.println("Min byte value: " + Byte.MIN_VALUE);
		
		//Definimos una variable tipo short
		short variableTipoShort = 125;
		System.out.println("short: " + variableTipoShort);
		System.out.println("Max short: " + Short.MAX_VALUE);
		System.out.println("Min short: " + Short.MIN_VALUE);
		
		//Definimos una variable de tipo int (32 bits)
		int variableTipoInt = 1256;
		System.out.println("int: " + variableTipoInt);
		System.out.println("Max int value: " + Integer.MAX_VALUE); //2147483647
		System.out.println("Min int value: " + Integer.MIN_VALUE);
		
		//Definimos una variable de tipo long (64 bits)
		long variableTipoLong = 1258;
		System.out.println("long: " + variableTipoLong);
		System.out.println("Max long value: " + Long.MAX_VALUE); //9223372036854775807
		System.out.println("Min long value: " + Long.MIN_VALUE);
		
		//Nota: las literales numéricas son de tipo int.
		// eje: 85452, 0, -26846516
		//indicando la letra L (de preferencia mayúsculas) hacemos
		//las literales numéricas de 64 bits.
		//long maxValueLong = 2147483648L;
		
		//Definimos una varibale de tipo float (32 bits)
		//Nota: Las literales de punto flotante son de tipo Double
		//Agregando la f (de preferencia, MAYÚSCULA) hacemos
		//las literales de tipo float.
		float variableTipoFloat = 25.23f;
		System.out.println("float: " + variableTipoFloat);
		System.out.println("Max float value: " + Float.MAX_VALUE);
		System.out.println("Min float value: " + Float.MIN_VALUE);
		
		//Definimos una variable de tipo double (64 bits)
		double variableTipoDouble = 652.3256;
		System.out.println("double: " + variableTipoDouble);
		System.out.println("Max double value: " + Double.MAX_VALUE);
		System.out.println("Min double value: " + Double.MIN_VALUE);
		System.out.println("Suma 3.1 + 2.2 : " + (3.1*10+2.2*10)/10);
		
		//Definimos una variable de tipo boolean
		boolean variableTipoBoolean = true;
		System.out.println("boolean: " + variableTipoBoolean);
		variableTipoBoolean = false;
		System.out.println("boolean: " + variableTipoBoolean);
		
		//Definimos una variable de tipo char, entre apóstrofes
		//sólo almacena un caracter de la tabla Unicode (16 bits)
		//puede almacenar del 0 al 65535
		char variableTipoChar = 'K';
		System.out.println("char :" + variableTipoChar);
		variableTipoChar = '\u004C'; //L
		System.out.println("char :" + variableTipoChar);
		variableTipoChar = 77; //M
		System.out.println("char :" + variableTipoChar);
		//Asignar la letra Ñ en numérico
		variableTipoChar = 209; //Ñ
		System.out.println("char :" + variableTipoChar);
		
		//Reglas para el nombre de variables
		//Podemos usar cualquier caracter, pero
		//-No se puede comenzar el nombre con un número
		//int 5mentarios
		//-Utilizar en el nombre caracteres especiales
		//Sólo se puede usar el $ y _
		//int #myVar; No se puede
		//int my#Var; No se puede
		
		int $myVar; //se puede, pero no se recomienda
		int _myVar; //se puede, pero no se recomienda
		int sinC0mentario5; //puede ccontener número, pero no al inicio
		int myVarEspañol; //Se puede, pero no se recomienda, de preferencia
		                  //usar nombres en inglés
		
		//Representación numércia
		int varHexadecimal = 0x3C; //60 decimal
		int varBinario = 0b00_11_11_00;
		double varflotante = 12________56.2_5_6;
		
		//Conversión de tipos de datos.
		byte coquita600ml = 60;
		//upcasting
		short coquita21 = coquita600ml;
		System.out.println("Coquita 2L: " + coquita21);
		//downcasting
		short pozoleGrande = 64; //200 ml
		byte pozoleBurbuja = (byte) pozoleGrande; //byte -128 al 127
		System.out.println("pozoleBurbuja: " + pozoleBurbuja);
		
		//Datos de tipo string
		//Los datos de tipo String son considerados objetos
		//Se define usando comillas dobles
		String varTipoString = "Holi Crayoli";
		System.out.println("string: " + varTipoString);
		
		byte edadMascota = Byte.parseByte("10"); //se hizo la conversión a través de la clase Byte
		double edadPlaneta = Double.parseDouble("1256892");
		
		//Convirtiendo datos numéricos a string
		String edadMascotaString = String.valueOf(edadMascota);
		System.out.println("edad solovino: " + edadMascotaString);
		char primerCaracter = edadMascotaString.charAt(1);
		System.out.println("Primer caracter: " + primerCaracter);
		
		//Operadores numéricos
		//+, -, *, /, %, ++, --
		int operadorA = 10;
		int operadorB = 20;
		int suma = operadorA + operadorB;
		int resta = operadorA - operadorB;
		int multiplica = operadorA * operadorB;
		double division = (double)operadorA / operadorB; //forzar a la variable de tipo int para que muestre deimales, convirténdola a double
		int residuo = operadorA % 2;
		System.out.println("Suma: " + suma); //30
		System.out.println("Resta: " + resta); //-10
		System.out.println("Multiplicación: " + multiplica); //200
		System.out.println("División: " + division);
		System.out.println("Residuo: " + residuo);
		
		System.out.println("Preincremento: " + ++operadorA); //11
		System.out.println("Posdecremento: " + operadorA++); //11
		System.out.println("Valor: " + operadorA); //12
		
		System.out.println("Preincremento: " + --operadorB); //19
		System.out.println("Posdecremento: " + operadorB--); //19
		System.out.println("Valor: " + operadorB); //18
		System.out.println("Resultado: " + (10 * 2 + 4 -20 / 2)); //14
		
		// Operadores comparativos:
		// <, <=, >, >=, == , !=  
		int numEmpleados = 1000;
		System.out.println("Empleados > 1000: " + (numEmpleados > 1000) );
	    System.out.println("Empleados >= 1000: " + (numEmpleados >= 1000) );
		System.out.println("Empleados = 1000: " + (numEmpleados == 1000) );
		System.out.println("Empleados != 1000: " + (numEmpleados != 1000) );
		System.out.println("Resultado: " + (numEmpleados>1000 || numEmpleados == 100));
		
		//Operadores lógicos
		//&& (AND) Se retorna true si ambos operandos con true
		//|| (OR) Se retorna true si cualquiera de los operandos es true
		//! (NOT) Revierte el resultado
		//System.out.println("Operacion 15 && 'Hola '" + (15 && "Hola"));
		System.out.println(" Empleados <1000 || Empleados>1000 " 
				   + (numEmpleados < 1000 || numEmpleados >1000 ));//false
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        System.out.println((a && b) || (a && c)); //true
        System.out.println(a || b || c && a); //true
        System.out.println(!(a || b) && (!a || c)); //false
        System.out.println(a || b && c || a && b); //true
        
        //en Java ocurre una excepción al realizar una división por cero
        //System.out.println(5/0);

		
		
		
	}

}
