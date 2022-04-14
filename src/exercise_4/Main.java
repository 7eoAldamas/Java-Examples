package exercise_4;

import exercise_4.hijas.*;

/**
 * @author 7eoAldamas
 * 
 * En este ejercicio tendr�is que crear una clase SmartDevice. 
    1- Dentro crear�is las clases hijas: SmartPhone y SmartWatch.
    2- Agregar�is atributos tal cual tendr�an esos objetos en la realidad.
    3- Crear constructor vac�o y con todos los par�metros para cada clase.
    4- Desde una clase Main: crear�is objetos de cada una y los utilizar�is para imprimir sus valores por consola.
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartDevice xiaomi = new SmartPhone("Xiamo", "11-Pro", "MIU - Android", "Soy un telefono");
		SmartDevice reloj = new SmartWatch("Samsung", "Modelo-X", "Android", "Soy un reloj");
		
		System.out.println(xiaomi.getMarca() + " | " + xiaomi.getModelo() + " | " + xiaomi.getSoftware());
		System.out.println(xiaomi);
		System.out.println(reloj.getMarca() + " | " + reloj.getModelo() + " | " + reloj.getSoftware());
		System.out.println(reloj);
	}

}
