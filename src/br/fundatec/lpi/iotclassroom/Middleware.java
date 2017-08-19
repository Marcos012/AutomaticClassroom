package br.fundatec.lpi.iotclassroom;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

/**
 * Classe que faz a conexão entre os dispositivos e a aplicação.
 * @author Marcos
 *
 */
public class Middleware {
	
	public Middleware() {
		super();
	}
	
	/**
	 * Método que define os dados do dispositivo "Light".
	 * @return
	 * @throws SQLException
	 */
	public String reasonData() throws SQLException{
		Light lgt = new Light();
		int lightData;
		boolean lightData2;
		String returnMidd1, returnMidd2, returnMidd;
		
		
		lightData = lgt.GenerateData1();
		lightData2 = lgt.GenerateData();
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		Connection con = new ConnectionFactory().fabricate();
		
		MiddlewareDao midD = new MiddlewareDao(con);
		midD.adicionaLg(lightData, lightData2, calendar);
		
		if(lightData == 2){
			returnMidd1 = "Quatidade correta!";
		} else{
			returnMidd1 = "Quantidade errada!";
		}
		
		
		if(lightData2 == false){
			returnMidd2 = "Luzes apagadas";
		} else{
			returnMidd2 = "Luzes acesas";
		}
		returnMidd = "Quantidade de lampadas: "+returnMidd1 + "\n" + "Estado das lampadas: "+returnMidd2+"\n";
		
		con.close();
		
		return returnMidd;
	}	
	
	/**
	 * Método que define os dados do dispositivo "PC".
	 * @return
	 * @throws SQLException
	 */
	public String reasonData2() throws SQLException{
		PC pc = new PC();
		boolean pcData;
		String returnMidd;
		
		pcData = pc.GenerateData();
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		Connection con = new ConnectionFactory().fabricate();
		
		MiddlewareDao midD = new MiddlewareDao(con);
		midD.adicionaPc(pcData, calendar);
		if(pcData == false){
			returnMidd = "Computador Desligado";
		} else{
			returnMidd = "Computador Ligado";
		}
		
		con.close();
		
		return returnMidd;
	}
	
	/**
	 * Método que define os dados do dispositivo "AirConditioning".
	 * @return
	 * @throws SQLException
	 */
	public String reasonData3() throws SQLException {
		AirConditioning air = new AirConditioning();	
		boolean airData;
		int airData2;
		String returnMidd1, retunrMidd2, returnMidd;
		
		airData = air.GenerateData();
		airData2 = air.GenerateData2();
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		Connection con = new ConnectionFactory().fabricate();
		
		MiddlewareDao midD = new MiddlewareDao(con);
		midD.adicionaAc(airData, airData2, calendar);
		
		
		if(airData == false){
			returnMidd1 = "Ar Condicionado Ligado";
		} else{
			returnMidd1 = "Ar condicionado desligado";
		}
		
		
		if(airData2 == 20){
			retunrMidd2 = "Temperatura correta: "+airData2;
		} else{
			retunrMidd2 = "Temperatura errada: "+airData2;
		}
		
		returnMidd = "\nStatus: "+returnMidd1+"\n"+"Temperatura: "+retunrMidd2;
		con.close();
		
		return returnMidd;
	}
}
