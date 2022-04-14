package exercise_4;

import exercise_4.hijas.*;

/**
 * @author 7eoAldamas
 * 
 * En este ejercicio tendréis que crear una clase SmartDevice. 
    1- Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
    2- Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    3- Crear constructor vacío y con todos los parámetros para cada clase.
    4- Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
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
