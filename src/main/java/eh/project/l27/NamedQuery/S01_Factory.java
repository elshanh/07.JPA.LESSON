package eh.project.l27.NamedQuery;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface S01_Factory {
	
	EntityManager 		getEntityManager();
	EntityTransaction 	getTransaction();

}
