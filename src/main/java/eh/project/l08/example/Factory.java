package eh.project.l08.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface Factory {
	
	EntityManager getEntityManager();
	EntityTransaction getEntityTransaction();

}
