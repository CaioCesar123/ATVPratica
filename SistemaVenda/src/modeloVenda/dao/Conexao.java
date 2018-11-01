package modeloVenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
	
	public Connection obtemconxao(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/clientes?useTimezone=true&serverTimezone=UTC", 
					"root", "");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Falha Ao Estaciar o SQL");
			
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, 
					"Impossível realizar conexão com o banco.");
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}

}
