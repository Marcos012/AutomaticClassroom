package br.fundatec.lpi.iotclassroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe que faz a conexão com o banco de dados
 * @author Marcos
 *
 */
public class ConnectionFactory {
	
	public Connection fabricate(){
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Classroom", "postgres", "fundatec");
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		}
		
	}
