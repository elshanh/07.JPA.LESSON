package eh.project.l22.oneToManyRefactoring;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L22_Lesson;
import eh.project.l01.entity.L22_Student;

public class ProgMain {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		
		if (cnt == 0)
			insert();
		else
			select();	
	}
	
	private static void insert() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		L22_Student student1 = new L22_Student("Irade", "HUSEYNZADA");
		
		L22_Lesson lesson1 = new L22_Lesson("Java");
		lesson1.setStudents(student1);
		
		L22_Lesson lesson2 = new L22_Lesson("MySQL");
		lesson2.setStudents(student1);
		
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		
		entityManager.persist(student1);
		entityManager.persist(lesson1);
		entityManager.persist(lesson2);
		
		entityTransaction.commit();		
	}
	private static void select() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		L22_Student student1 = entityManager.find(L22_Student.class,1);
		System.out.println(student1.getLessons());
	}
}
