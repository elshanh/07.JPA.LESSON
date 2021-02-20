package eh.project.l20.oneToOneCascadeType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L20_Address;
import eh.project.l01.entity.L20_Student;

public class ProgMain {
	
	public static void main(String[] args) {
		
			int cnt = 1;
			
			if ( cnt == 0) {
				System.out.println("**************************INSERT THE START************************************************");
				insert();
				System.out.println("**************************INSERT THE END************************************************");
			}
			
			if ( cnt == 1) {
				System.out.println("**************************DELETE THE START************************************************");
				delete();
				System.out.println("**************************DELETE THE END************************************************");
			}
	}
	
	public static void insert() {

		L20_Student student1 = new L20_Student("Irade", "HUSEYNZADA");
		L20_Student student2 = new L20_Student("Akif", "HUSEYNZADA");
		L20_Student student3 = new L20_Student("Fidan", "HUSEYNZADA");
		
		L20_Address address1 = new L20_Address("Y.Aliyev", 2595, "Sabuncu", "Baku", 1010);
		L20_Address address2 = new L20_Address("Y.Aliyev", 2595, "Sabuncu", "Baku", 1010);
		L20_Address address3 = new L20_Address("Y.Aliyev", 2595, "Sabuncu", "Baku", 1010);
		
		student1.setStudentAddress(address1);
		student2.setStudentAddress(address2);
		student3.setStudentAddress(address3);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();		
		
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		
		entityTransaction.commit();
	}
	
	public static void delete() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		L20_Student student = entityManager.find(L20_Student.class, 1);
		
		entityManager.getTransaction().begin();
		
		entityManager.remove(student);
		
		entityManager.getTransaction().commit();
		
	}
	
}
