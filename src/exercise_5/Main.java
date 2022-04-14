package exercise_5;

import exercise_5.interfaces.CocheCRUD;

/**
 * @author 7eoAldamas
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CocheCRUD coche = new CocheImpl();
		System.out.println(coche.save());
		System.out.println(coche.findAll());
		System.out.println(coche.delete());
	}

}
