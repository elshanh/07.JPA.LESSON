package eh.project.l27.NamedQuery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class S02_FactoryImpl implements S01_Factory {
	
	private EntityManager entityManager = null;
	
	@Override
	public EntityManager getEntityManager() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		
		this.entityManager = entityManagerFactory.createEntityManager();
		
		return entityManager;
	}
	
	@Override
	public EntityTransaction getTransaction() {
		
		EntityTransaction entityTransaction = this.entityManager.getTransaction();
		
		return entityTransaction;
	}


}
