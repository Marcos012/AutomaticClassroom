package br.fundatec.lpi.iotclassroom;

/**
 * Classe que representa as luzes.
 * @author Marcos
 *
 */
public class Light implements Device{
	private boolean ds_status;
	private int qtd_lamps;
	
	public Light() {
		super();
	}

	public boolean isDs_status() {
		return ds_status;
	}
	public void setDs_status(boolean ds_status) {
		this.ds_status = ds_status;
	}
	public int getQtd_lamps() {
		return qtd_lamps;
	}
	public void setQtd_lamps(int qtd_lamps) {
		this.qtd_lamps = qtd_lamps;
	}
	
	
	/**
	 * Função que define a quantidade correta de luzes. 
	 * @return
	 */
	public int GenerateData1(){
		int qtd_lamps = 2;
		return qtd_lamps;
	}

	
	@Override
	public boolean GenerateData() {
		boolean ds_status = false;
		return ds_status;
	}
	
}
