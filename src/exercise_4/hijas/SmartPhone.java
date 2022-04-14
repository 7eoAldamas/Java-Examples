package exercise_4.hijas;

import exercise_4.SmartDevice;

/**
 * @author 7eoAldamas
 *
 */
public class SmartPhone extends SmartDevice{
	
	private String phone;

	public SmartPhone(String marca, String modelo, String software, String phone) {
		super(marca, modelo, software);
		this.phone = phone;
	}

	@Override
	public String toString() {
		return " \tSmartPhone [Phone=" + phone +
				"]";
	}	

}
