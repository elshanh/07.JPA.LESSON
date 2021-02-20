package eh.project.l25.ManyToMany;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L25_Student;
import eh.project.l01.entity.L25_Course;

public class ProgMain {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		L25_Course course1 = new L25_Course("Programming Course");
		L25_Course course2 = new L25_Course("Language  Course");
		L25_Course course3 = new L25_Course("DB  Course");
		
		
		L25_Student student1 = new L25_Student("Irade", "HUSEYNZADA", new Date());
		L25_Student student2 = new L25_Student("Akif", "HUSEYNZADA", new Date());
		L25_Student student3 = new L25_Student("Fidan", "HUSEYNZADA", new Date());
		
		student1.addCourse(course1);
		student1.addCourse(course2);
		
		student2.addCourse(course1);
		student2.addCourse(course3);
		
		student3.addCourse(course3);
		
		entityTransaction.begin();
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityTransaction.commit();
	}

}
