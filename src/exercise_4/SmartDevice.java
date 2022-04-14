package exercise_4;

public class SmartDevice {
	
	private String marca;
	private String modelo;
	private String software;
	
	public SmartDevice(String marca, String modelo, String software) {
		this.marca = marca;
		this.modelo = modelo;
		this.software = software;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	@Override
	public String toString() {
		return " SmartDevice [Marca: " + marca + 
				" Modelo: " + modelo + 
				" Software: " + software +
				"]";
	}	

}
