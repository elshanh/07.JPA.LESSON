package eh.project.l09.generatedValue;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L09_Student;

public class ProgMain {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		L09_Student student1Insert = new L09_Student("Irade", "HUSEYNZADA", 123451, "Doctor", new Date());
		L09_Student student2Insert = new L09_Student("Akif", "HUSEYNZADA", 123452, "Economic", new Date());
		L09_Student student3Insert = new L09_Student("Fidan", "HUSEYNZADA", 123453, "Teacher", new Date());
		
		entityTransaction.begin();
		
		entityManager.persist(student1Insert);
		entityManager.persist(student2Insert);
		entityManager.persist(student3Insert);
		
		entityTransaction.commit();
		
		System.out.println("**************************THE END************************************************");	
	}
}
