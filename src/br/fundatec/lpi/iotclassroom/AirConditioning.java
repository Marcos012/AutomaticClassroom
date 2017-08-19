package br.fundatec.lpi.iotclassroom;

/**
 * Classe que representa um ar condicionado.
 * @author Marcos
 */
public class AirConditioning implements Device{
	private boolean ds_status;
	private int ds_temperature;
	
	public AirConditioning() {
		super();
	}

	public boolean isDs_status() {
		return ds_status;
	}
	public void setDs_status(boolean ds_status) {
		this.ds_status = ds_status;
	}

	public int getDs_temperature() {
		return ds_temperature;
	}
	public void setDs_temperature(int ds_temperature) {
		this.ds_temperature = ds_temperature;
	}
	
	public boolean GenerateData(){
		boolean ds_status = false;
		return ds_status;
	}
	
	/**
	 * Função que define a temperatura padrao do ar condicionado.
	 * @return
	 */
	public int GenerateData2() {
		int temp = 20;
		return temp;
	}
}
