package eh.project.l21.oneToMany;

import java.util.List;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L21_Lesson;
import eh.project.l01.entity.L21_Student;

public class ProgMain {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		L21_Student student1 = new L21_Student("Irade", "HUSEYNZADA");
		
		L21_Lesson lesson1 = new L21_Lesson("Java");
		L21_Lesson lesson2 = new L21_Lesson("MySQL");
		
		List<L21_Lesson> lessons1 = Arrays.asList(lesson1,lesson2);
		
		student1.setLessons(lessons1);
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		
		entityManager.persist(student1);
		entityManager.persist(lesson1);
		entityManager.persist(lesson2);
		
		entityTransaction.commit();
		
	}
}
