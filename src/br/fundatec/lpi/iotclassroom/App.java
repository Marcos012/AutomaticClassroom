package br.fundatec.lpi.iotclassroom;

import java.sql.SQLException;

/**
 * Classe que executa o Middleware.
 * @author Marcos
 *
 */
public class App {

	public static void main(String[] args) throws SQLException  {
		
		Middleware mid = new Middleware();
		
		System.out.println("Conectado");
		
		System.out.println(mid.reasonData());
		System.out.println(mid.reasonData2());
		System.out.println(mid.reasonData3());
		
		
	}

}
