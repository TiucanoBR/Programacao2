package orm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListaTarefasJPQL {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();

		String sql = "select t from Tarefa as t where t.finalizado = false";
		
		@SuppressWarnings("unchecked")
		List<Tarefa> lista = manager.createQuery(sql).getResultList();
		
		for (Tarefa tarefa : lista) {
			System.out.println("-------------------------------");
			System.out.println("Tarefa: "+tarefa.getDescricao());
		}
		manager.close();
		factory.close();
	}
}
