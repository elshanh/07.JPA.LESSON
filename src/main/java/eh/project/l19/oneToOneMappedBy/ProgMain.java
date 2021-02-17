package eh.project.l19.oneToOneMappedBy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L19_Address;
import eh.project.l01.entity.L19_Student;

public class ProgMain {
	
	public static void main(String[] args) {
		
			int cnt = 1;
			
			if ( cnt == 0) {
				System.out.println("**************************INSERT THE START************************************************");
				insert();
				System.out.println("**************************INSERT THE END************************************************");
			}
			
			if ( cnt == 1) {
				System.out.println("**************************SELECT THE START************************************************");
				select();
				System.out.println("**************************SELECT THE END************************************************");
			}
	}
	
	public static void insert() {

		L19_Student student1 = new L19_Student("Irade", "HUSEYNZADA");
		L19_Student student2 = new L19_Student("Akif", "HUSEYNZADA");
		L19_Student student3 = new L19_Student("Fidan", "HUSEYNZADA");
		
		L19_Address address1 = new L19_Address("Y.Aliyev", 2595, "Sabuncu", "Baku", 1010);
		L19_Address address2 = new L19_Address("Y.Aliyev", 2595, "Sabuncu", "Baku", 1010);
		L19_Address address3 = new L19_Address("Y.Aliyev", 2595, "Sabuncu", "Baku", 1010);
		
		student1.setStudentAddress(address1);
		student2.setStudentAddress(address2);
		student3.setStudentAddress(address3);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();		
		entityManager.persist(student1);
		entityManager.persist(address1);
		entityManager.persist(student2);
		entityManager.persist(address2);
		entityManager.persist(student3);
		entityManager.persist(address3);		
		entityTransaction.commit();
	}
	
	public static void select() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//Student student = entityManager.find(Student.class, 1);
		
		L19_Address address = entityManager.find(L19_Address.class, 2);
		System.out.println(address.getStudent());
		//System.out.println(student);
	}
	
}
