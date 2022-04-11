package exercise_3;

import java.util.Scanner;

/**
 * @author 7eoAldamas
 * 
 * En este ejercicio teneís que crear un bucle que permita concatenar textos e 
   imprimir el resultado final por consola.
    
   		Nota: Tened en cuenta que los textos pueden venir de un array de String 
 */
public class exercise_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String[] textos;
		int cantidadTextos = 0;
		
		System.out.println(" *- Ingrese la cantidad de textos:");
		cantidadTextos = sr.nextInt();
		textos = new String[cantidadTextos];
		
		// Guardar textos 
		for (int i = 0; i < cantidadTextos; i++) {
			System.out.println(" *- Texto No " + (i + 1));
			textos[i] = sr.next();
		}
		
		System.out.println(" *- Textos Almacenados\n");
		
		// Mostrar Textos 
		for (String text : textos) {
			System.out.print(text);
		}
		
		sr.close();
	}

}
