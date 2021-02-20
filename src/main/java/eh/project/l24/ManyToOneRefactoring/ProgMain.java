package eh.project.l24.ManyToOneRefactoring;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L24_Lesson;
import eh.project.l01.entity.L24_Student;

public class ProgMain {
	
	public static void main(String[] args) {
		
		int cnt = 2;
		
		if (cnt == 0)
			insertLesson();
		if (cnt == 1)
			insertStudent();
		if (cnt == 2)
			select();		
	}
	
	private static void insertLesson() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		L24_Lesson lesson1 = new L24_Lesson("Java");
		L24_Lesson lesson2 = new L24_Lesson("MySQL");		
		
		entityTransaction.begin();
		entityManager.persist(lesson1);
		entityManager.persist(lesson2);
		entityTransaction.commit();
		
	}
	private static void insertStudent() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		L24_Student student1 = new L24_Student("Irade", "HUSEYNZADA");
		L24_Student student2 = new L24_Student("Akif", "HUSEYNZADA");
		L24_Student student3 = new L24_Student("Fidan", "HUSEYNZADA");
		
		L24_Lesson lesson1 = entityManager.find(L24_Lesson.class,1);
		L24_Lesson lesson2 = entityManager.find(L24_Lesson.class,2);
		
		student1.setLesson(lesson1);
		student2.setLesson(lesson1);
		student3.setLesson(lesson2);
		
		entityTransaction.begin();
		
		entityManager.persist(student1);
		entityManager.persist(student2);		
		entityManager.persist(student3);
		
		entityTransaction.commit();		
	}	
	
	private static void select() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		L24_Lesson lesson = entityManager.find(L24_Lesson.class,1);
		
		System.out.println(lesson.getStudents());
	
	}	
}
