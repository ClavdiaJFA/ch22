package mx.generation;

public class DatosInmutables {

	public static void main(String[] args) {
		// datos inmutables: que no cambia su valor
		
		String nombre = "Pax";
		//nombre = "Juan";
		String participante = "Pax";
		String personaCH22 = new String("Pax"); //frozando a Java a crear un objeto
		
		if (nombre == participante) {
			System.out.println("CEO de CH22");
		}
		if (nombre == personaCH22) {
			System.out.println("CEO de Generation");
		}
		
		if (nombre.equals(personaCH22)) {
		System.out.println("CEO del mundo");
		}
		
		System.out.println("mi " + "mejor " + "amigo " + "se llama " + participante);
	}

}
