package orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InserirTarefa {
	public static void main(String[] args) {
		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Fazer trabalho angular");
		tarefa.setFinalizado(false);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(tarefa);
		manager.getTransaction().commit();
		
		System.out.println("ID da tarefa: "+tarefa.getId());
		System.out.println("Conteúdo da tarefa: "+tarefa.getDescricao());
		System.out.println("Tarefa finalizada: "+tarefa.isFinalizado());
		
		manager.close();
		factory.close();
		
	}
}
