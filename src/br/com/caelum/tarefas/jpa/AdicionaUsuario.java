package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.model.Usuario;

public class AdicionaUsuario {
public static void main(String[] arg){
		
		Usuario usuario = new Usuario();
		usuario.setUser("teste");
		usuario.setPass("teste");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("usuarios");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		
		manager.close();		
	}
}
