package eh.project.l12.elementCollection;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L12_Student;

public class ProgMain {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		L12_Student student1 = new L12_Student("Irade", "HUSEYNZADA", Arrays.asList("1111","2222"));
		L12_Student student2 = new L12_Student("Akif", "HUSEYNZADA", Arrays.asList("3333","4444"));
		L12_Student student3 = new L12_Student("Fidan", "HUSEYNZADA", Arrays.asList("5555","6666"));
		
		entityTransaction.begin();
		
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		
		entityTransaction.commit();
		
		System.out.println("**************************THE END************************************************");	
		
	}

}
