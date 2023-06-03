package colecciones;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class ColeccionesApuntes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// public interface Collecion<E>;

		// En una lista comoo este arraylist de strings se puede añadir el mismo
		// elemento dos veces.
		ArrayList<String> prueba = new ArrayList<String>(5);// VALOR INICIAL QUE SE SOBREPASA AUTOMATICAMENTE. PUEDE
															// MEJORAR MINIMAMENTE EL RENDIMIENTO

		String hola = "hola";
		String hola1 = "hola1";
		String hola2 = "hola2";
		String hola3 = "hola3";
		String hola4 = "hola4";

		prueba.add(hola);
		prueba.add(hola1);
		prueba.add(hola2);
		prueba.add(hola3);
		prueba.add(hola4);
		prueba.add(hola);

		System.out.println(prueba.toString());

		// En el set, los datos añadidos son únicos, no pueden coincidir, aunque se
		// inserte(no da error) este no aparecerá repetido dentro.
		// Esto aplica aunque el valor que introduzcamos provenga de una variable
		// diferente. Es decir, es por valor y no por referencia en memoria.
		Set<String> prueba2 = new HashSet<String>();// VALOR INICIAL QUE SE SOBREPASA AUTOMATICAMENTE. PUEDE MEJORAR
													// MINIMAMENTE EL RENDIMIENTO

		prueba2.add(hola);
		prueba2.add(hola1);
		prueba2.add(hola2);
		prueba2.add(hola3);
		prueba2.add(hola4);
		prueba2.add("hola");

		System.out.println(prueba2.toString());

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(2);

		System.out.println("el número introducido es" + numeros.toString());

		int receptor;
		receptor = numeros.get(0);
		// Interesante que el wrapper del tipo de datos primitivo convierta el dato a un
		// objeto, y que ese objeto pueda ser introducido directamente en un tipo
		// primitivo sin ninguna operación por nuestra parte:
		System.out.println("El receptor ha funcionado correctamente: " + receptor);

		/////////// PRUEBAS CON ENUMS/////////

		System.out.println(Enums.ADIOS.getValue());

		Enums.ADIOS.setValue("adiosito");

		System.out.println(Enums.ADIOS.getValue());

		// Enum de Math
		double e;
		e = Math.E;
		System.out.println(e);

		System.out.println(Enums.ADIOS.ordinal());// el metodo ordinal muestra la posición de creación. Va de 0 a n
		System.out.println(Enums.HOLA.ordinal());

		for (Enums a : Enums.values()) {
			System.out.print("--" + a.getValue() + "--"); // Mostrar el contenido del Enum
			System.out.print(a + "\n"); // Mostrar el nombre del enum.
		}

		System.out.println(DayOfWeek.FRIDAY.getValue());// Muestra el valor en número
		System.out.println(DayOfWeek.FRIDAY);// Muestra el valor en mayúsuclas

		probando();

		// PRUEBAS CON DATO GENERICO EN UNA CLASE, private static de la clase miclase
		// para poder crearla en el main.
		MiClase<String> instancia1 = new MiClase<>("Hola");
		ArrayList<Object> probandoE = new ArrayList<Object>();

		// Objeto integer con el mayor valor.
		Integer testing = Integer.MAX_VALUE;
		// Se puede operar con objetos de la envolvente y el tipo de datos primitivos
		// correspondiente, pero se realizan operaciones de autounboxing/unboxing que
		// afectan al rendimiento.
		System.out.println(testing - 100);

	}

	// Pequeña prueba para comprobar que el nombre de la función y los nombres de
	// variables dentro de la funcion pueden coincidir (otra cosa es que sea o no
	// buena práctica)
	public static int probando() {
		int probando = 1;
		System.out.println(probando);
		return probando;
	}

	// Clase privada (por estar en la misma que la clase que tambien contiene el
	// main. Cuyas instancias de la clase incluirán un tipo de objeto(genérico).
	// Además, implementa la interfaz basica de las colecciones de datos, por lo que
	// debe incluir una serie de métodos/funcionalidades de forma obligatoria.
	private static class MiClase<E> implements Collection {
		private E elemento;

		public MiClase(E elemento) {
			this.elemento = elemento;
		}

		public E getElemento() {
			return elemento;
		}

		private class prueba23 {
			private int abc;

		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray(Object[] a) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean add(Object e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub

		}
	}

}
