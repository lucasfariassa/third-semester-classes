package br.ucsal.class4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	public static void main(String[] args) {
		String url = "jdbc:hsqldb:mem:mymendb";
		String user = "sa"; // essa nomenclatura é usada convencionalmente - this nomenclature is conventionally used
		String password = "";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			Statement statement = connection.createStatement();
			// Criando uma tabela de cadastro de alunos - Creating a student registration table:
			String sql = "CREATE TABLE ALUNOS (ID INT PRIMARY KEY, "
					+ "MATRICULA CHAR(20), "
					+ "NOME VARCHAR(250))";
			statement.execute(sql);
			System.out.println("Status: TABELA CRIADA - CREATED TABLE");
			
			// Inserindo um estudante na tabela - Inserting a student into table:
			Statement insert = connection.createStatement();
			String sqlInsert = "INSERT INTO ALUNOS (ID, MATRICULA, NOME)"
					+ " VALUES (1, '202012301', 'Pedro de Alcântara J. "
					+ "C. L. S. B. F. X. P. L. M. G. R. G. "
					+ "de Bragança e Bourbon')";
			insert.execute(sqlInsert);
			System.out.println("Status: ALUNO INSERIDO NA TABELA - STUDENT INSERTED INTO TABLE");
			
			// Inserindo outro estudante na tabela - Inserting another student into table:
			sqlInsert = "INSERT INTO ALUNOS (ID, MATRICULA, NOME)"
					+ " VALUES (2, '202123402', 'Isabel C. L. A. M. G. R. G."
					+ " de Bragança e Bourbon-Duas Sicílias')";
			insert.execute(sqlInsert);
			System.out.println("Status: ALUNO INSERIDO NA TABELA - STUDENT INSERTED INTO TABLE");
			
			// Selecting and printing the selected information about the student 1:
			Statement select = connection.createStatement();
			int variable1 = 1;
			String sqlSelect = "SELECT ID, MATRICULA, NOME FROM ALUNOS"
					+ " WHERE ID=" + variable1; /* pode-se usar um asterisco 
					que seleciona todas as colunas - an asterisk could be used to select all columns */
			ResultSet resultSet = select.executeQuery(sqlSelect);
			while(resultSet.next()) {
				System.out.println("_______________________________________________________________________________________________");
				System.out.println("Nome do Aluno: " + resultSet.getString(3));
				System.out.println("Matrícula: " + resultSet.getString(2));
				System.out.println("_______________________________________________________________________________________________");
				
			}
			
			// Selecting and printing the selected information about the student 2:
			select = connection.createStatement();
			int variable2 = 2;
			sqlSelect = "SELECT ID, MATRICULA, NOME FROM ALUNOS"
					+ " WHERE ID=" + variable2; /* pode-se usar um asterisco 
					que seleciona todas as colunas - an asterisk could be used to select all columns */
			resultSet = select.executeQuery(sqlSelect);
			while(resultSet.next()) {
				System.out.println("Nome do Aluno: " + resultSet.getString(3));
				System.out.println("Matrícula: " + resultSet.getString(2));
				System.out.println("_______________________________________________________________________________________________");
			}
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		}

}
