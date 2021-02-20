package eh.project.l23.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L23_Lesson;
import eh.project.l01.entity.L23_Student;

public class ProgMain {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		
		if (cnt == 0)
			insertLesson();
		if (cnt == 1)
			insertStudent();	
	}
	
	private static void insertLesson() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		L23_Lesson lesson1 = new L23_Lesson("Java");
		L23_Lesson lesson2 = new L23_Lesson("MySQL");		
		
		entityTransaction.begin();
		entityManager.persist(lesson1);
		entityManager.persist(lesson2);
		entityTransaction.commit();
		
	}
	private static void insertStudent() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		L23_Student student1 = new L23_Student("Irade", "HUSEYNZADA");
		L23_Student student2 = new L23_Student("Akif", "HUSEYNZADA");
		L23_Student student3 = new L23_Student("Fidan", "HUSEYNZADA");
		
		L23_Lesson lesson1 = entityManager.find(L23_Lesson.class,1);
		L23_Lesson lesson2 = entityManager.find(L23_Lesson.class,2);
		
		student1.setLesson(lesson1);
		student2.setLesson(lesson1);
		student3.setLesson(lesson2);
		
		entityTransaction.begin();
		
		entityManager.persist(student1);
		entityManager.persist(student2);		
		entityManager.persist(student3);
		
		entityTransaction.commit();		
	}	

}
