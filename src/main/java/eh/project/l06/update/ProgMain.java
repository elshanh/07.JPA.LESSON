package eh.project.l06.update;

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
		L04_Student student =  entityManager.find(L04_Student.class, 1);
		
		System.out.println("------------------------------------------------------------------------");
		
		if (student != null) {
			student.setStudentFaculity("Computer Engineering");
			transaction.begin();
			entityManager.merge(student);
			transaction.commit();
			System.out.println("Update Student Information");
		}else {
			System.out.println("Student Data not found");
		}
	}
}
