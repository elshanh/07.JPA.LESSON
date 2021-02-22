package eh.project.l26.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class S03_FactoryImpl implements S02_Factory {
	
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
