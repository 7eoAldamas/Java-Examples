package exercise_5;

import exercise_5.interfaces.CocheCRUD;

public class CocheImpl implements CocheCRUD {

	@Override
	public String save() {
		return " *- Metodo Save - CocheImpl";
	}

	@Override
	public String findAll() {
		return " *- Metodo Find All - CocheImpl";
	}

	@Override
	public String delete() {
		return " *- Metodo Delete - CocheImpl";
	}

}
