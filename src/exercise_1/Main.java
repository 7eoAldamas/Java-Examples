package exercise_1;

/**
 * @author 7eoAldamas
 * 
 * Para este primer ejercicio tendréis que realizar lo siguiente:
	1- Crea un proyecto de Java desde 0
	2- Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
	3- Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
	
		Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
		
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// numbers
		byte num  = 120;
		short num2 = 1200;
		int num3 = 2000;
		long num4 = 300000000;
		
		// float - double
		float num5 = 12.0f;
		double num6 = 3.141516;
		
		// boolean
		boolean isFalse = true;
		
		// char
		char caracter = 'A';
		
		// Objeto String
		String name = "Leobardo Gonzalez Aldamas";
		
		// stdout
		System.out.println("byte=> " + num + ", short=> " + num2);
		System.out.println("int=> " + num3 + ", long=> " + num4);
		System.out.println("float=> " + num5 + ", double=> " + num6);
		
		System.out.println("boolean=> " + isFalse);
		
		System.out.println("char=> " + caracter + ", String=> " + name);
			
	}

}
