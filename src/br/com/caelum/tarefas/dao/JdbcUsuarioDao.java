package br.com.caelum.tarefas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.caelum.tarefas.model.Usuario;
import connection.ConnectionFactory;

public class JdbcUsuarioDao {
	private Connection connection;

	public JdbcUsuarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public JdbcUsuarioDao(Connection connection) {
		this.connection = connection;
	}

	public boolean existeUsuario(Usuario usuario) {
		String sql = "select * from usuarios where login = ? and senha = ?";

		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, usuario.getUser());
			stmt.setString(2, usuario.getPass());
			ResultSet rs = stmt.executeQuery();
			stmt.execute();

			if (rs.next()) {
				stmt.close();
				return true;
			} else {
				stmt.close();
				return false;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
