package modeloVenda.dao;

import java.sql.Connection;

public class ModeloVendaDAO {
	
	private Connection conexao;
	
	public static ModeloVendaDAO instancia;
	
	public static ModeloVendaDAO getModeloVendaDAO() {
		if(instancia == null) {
			instancia = new ModeloVendaDAO();
			return instancia;
		} else {
			return instancia;
		}
	}
	
	

}
