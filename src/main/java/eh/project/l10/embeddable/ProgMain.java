package eh.project.l10.embeddable;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L10_Contact;
import eh.project.l01.entity.L10_User;

public class ProgMain {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		L10_User user = new L10_User("admin", "12345", new L10_Contact("055-222-33-44", "email@email.com", "www.web.com"), new Date());
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
		System.out.println("**************************THE END************************************************");	
		
	}

}
