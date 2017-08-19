package br.fundatec.lpi.iotclassroom;

/**
 * Classe que representa um Computador.
 * @author Marcos
 *
 */
public class PC implements Device{
	private boolean ds_status;

	
	public PC() {
		super();
	}

	public boolean isDs_status() {
		return ds_status;
	}

	public void setDs_status(boolean ds_status) {
		this.ds_status = ds_status;
	}

	@Override
	public boolean GenerateData() {
		boolean ds_status = false;
		return ds_status;
	}
	
	
	

	
}
