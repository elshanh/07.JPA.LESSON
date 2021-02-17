package eh.project.l13.elementCollection_CollectionTable;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L13_Student;

public class ProgMain {
	
	public static void main(String[] args) {
		
		L13_Student student1 = new L13_Student("Irade", "HUSEYNZADA", Arrays.asList("1111","2222"));
		L13_Student student2 = new L13_Student("Akif", "HUSEYNZADA", Arrays.asList("3333","4444"));
		L13_Student student3 = new L13_Student("Fidan", "HUSEYNZADA", Arrays.asList("5555","6666"));
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();		
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityTransaction.commit();
		
		System.out.println("**************************THE END************************************************");	
		
	}

}
