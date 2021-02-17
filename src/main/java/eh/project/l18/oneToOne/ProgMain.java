package eh.project.l18.oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L18_Address;
import eh.project.l01.entity.L18_Student;


public class ProgMain {
	
	public static void main(String[] args) {
		
		int control = 0;
		
		if (control == 0) {
			System.out.println("**************************INSERT THE START************************************************");
			insert();
			System.out.println("**************************INSERT THE END************************************************");
		}	
	}
	
	public static void insert() {

		L18_Student student = new L18_Student("Elshan", "HUSEYNZADA");
		L18_Address address = new L18_Address("Y.Aliyev", 2595, "Sabuncu", "Baku", 1010);
		
		student.setStudentAddress(address);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();		
		entityManager.persist(student);
		entityManager.persist(address);
		entityTransaction.commit();
	}
	
}
