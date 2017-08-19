package br.fundatec.lpi.iotclassroom;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * Classe que faz a conexão com o Banco de dados.
 * Possui as funções de adição dos dados gerados.
 * @author Marcos
 *
 */
public class MiddlewareDao {

	private Connection con;

	public MiddlewareDao(Connection con) {
		super();
		this.con = con;
	}

	/**
	 * Método que realiza a inserção de dados na tabela "AirConditioning".
	 * @param GeneratedData
	 * Campo de inserção do primeiro dado gerado do tipo Boolean.
	 * @param GenerateData2
	 * Campo de inserção do segundo dado gerado do tipo Int.
	 * @param dt
	 * Campo de inserção do terceiro dado gerado do tipo Calendar.
	 */
	public void adicionaAc(boolean GeneratedData, int GenerateData2, Calendar dt) {

		String sql = "INSERT INTO AirConditioning (GeneratedData1,GenerateData2, Date1)" + "VALUES (?,?,?)";

		try {
			PreparedStatement stmt = this.con.prepareStatement(sql);
			stmt.setBoolean(1, GeneratedData);
			stmt.setInt(2, GenerateData2);
			stmt.setDate(3, new Date(dt.getTimeInMillis()));

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método que realiza a inserção de dados na tabela "PC".
	 * @param GeneratedData
	 * Campo de inserção do primeiro dado gerado do tipo Boolean.
	 * @param dt
	 * Campo de inserção do segundo dado gerado do tipo Calendar.
	 */
	public void adicionaPc(boolean GeneratedData, Calendar dt) {

		String sql = "INSERT INTO PC (GeneratedData, Date1)" + "VALUES (?,?)";

		try {
			PreparedStatement stmt = this.con.prepareStatement(sql);
			stmt.setBoolean(1, GeneratedData);
			stmt.setDate(2, new Date(dt.getTimeInMillis()));

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método que realiza a inserção de dados na tabela "Lights".
	 * @param GeneratedData
	 * Campo de inserção do primeiro dado gerado do tipo Boolean.
	 * @param GeneratedData2
	 * Campo de inserção do segundo dado gerado do tipo Int.
	 * @param dt
	 * Campo de inserção do segundo dado gerado do tipo Calendar.
	 */
	public void adicionaLg(int GeneratedData, boolean GeneratedData2, Calendar dt) {

		String sql = "INSERT INTO Lights (GeneratedData1, GenerateData2, Date1)" + "VALUES (?,?,?)";

		try {
			PreparedStatement stmt = this.con.prepareStatement(sql);
			stmt.setInt(1, GeneratedData);
			stmt.setBoolean(2, GeneratedData2);
			stmt.setDate(3, new Date(dt.getTimeInMillis()));

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
