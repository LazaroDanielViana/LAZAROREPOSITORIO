package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManagerEntityManager {
	EntityManagerFactory factory;
	EntityManager entityManager;
	/* Metodo de Criação do Entity Manager */
	private EntityManager geraEntityManager(){
		factory = Persistence.createEntityManagerFactory("EFDPU");
		
		if (entityManager == null){
			entityManager = factory.createEntityManager();
		}
		if (!factory.isOpen()) {
			System.out.println("Nova conexão");
			entityManager = factory.createEntityManager();
			return entityManager;
		}else{
			System.out.println("Utilizando conexão já aberta");
			return entityManager;
		}
	}
	public EntityManager getEntityManager(){
		return geraEntityManager();
	}
}
