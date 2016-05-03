package br.com.caelum.tarefa.dao;

import java.sql.Connection;

import br.com.caelum.tarefas.model.Usuario;
import connection.ConnectionFactory;

public class JdbcUsuarioDao {
	private Connection connection;

    public JdbcUsuarioDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

	public boolean existeUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
