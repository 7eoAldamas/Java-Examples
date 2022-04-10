package exercise_2;

import java.util.Scanner;

/**
 * @author 7eoAldamas
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Introduce un numero: ");
        numero = sr.nextInt();

        double iva = (numero * 0.21);

        System.out.println("El resultado con IVA es: " + (numero + iva));        
        sr.close();
        
	}

}
