package exercise_4.hijas;

import exercise_4.SmartDevice;

/**
 * @author 7eoAldamas
 *
 */
public class SmartWatch extends SmartDevice{
	
	private String watch;
	
	public SmartWatch(String marca, String modelo, String software, String watch) {
		super(marca, modelo, software);
		this.watch = watch;
	}

	@Override
	public String toString() {
		return " \tSmartWatch [Watch=" + watch +
				"]";
	}	

}
