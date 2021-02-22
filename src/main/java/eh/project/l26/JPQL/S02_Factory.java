package eh.project.l26.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface S02_Factory {
	
	EntityManager 		getEntityManager();
	EntityTransaction 	getTransaction();

}
