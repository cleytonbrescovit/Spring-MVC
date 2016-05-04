package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.model.Tarefa;

public class AlteraTarefa {
	public static void main(String[] args) {
		
		Tarefa tarefa = new Tarefa();
		tarefa.setId(2L);
		tarefa.setDescricao("Estudar JPA e Hibernate Alterando o Apostila Caelum");
		tarefa.setFinalizado(0);
		tarefa.setDataFinalizacao(null);

	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
	    EntityManager manager = factory.createEntityManager();

	    manager.getTransaction().begin();
	    manager.merge(tarefa);
	    manager.getTransaction().commit();

	    manager.close();
	  }
}
