package br.com.caelum.tarefas.jpa;

import javax.persistence.*;

import br.com.caelum.tarefas.model.Tarefa;

public class RemoveTarefa {
	public static void main(String[] args) {

	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
	    EntityManager manager = factory.createEntityManager();

	    Tarefa encontrada = manager.find(Tarefa.class, 3L);

	    manager.getTransaction().begin();
	    manager.remove(encontrada);
	    manager.getTransaction().commit();

	    manager.close();
	  }
}
