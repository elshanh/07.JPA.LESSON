package eh.project.l04.insert;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L04_Student;

public class ProgMain {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		L04_Student student = new L04_Student(1, "Akif","HUSEYNZADA",1234567890,"Economic", new Date());
		
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
	}
}
