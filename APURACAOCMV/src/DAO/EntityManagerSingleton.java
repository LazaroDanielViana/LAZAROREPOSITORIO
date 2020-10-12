package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerSingleton {

	private static EntityManager em;

	private EntityManagerSingleton() {

	}

public static EntityManager getInstance(){
	if(em == null){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EFDPU");
		em = emf.createEntityManager();
	}
	return em;
}

}