package eh.project.l14.elementCollectionListAddress;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L14_Address;
import eh.project.l01.entity.L14_Student;

public class ProgMain {
	
	public static void main(String[] args) {
		
		L14_Student student1 = new L14_Student("Irade", "HUSEYNZADA");
		L14_Student student2 = new L14_Student("Akif", "HUSEYNZADA");
		L14_Student student3 = new L14_Student("Fidan", "HUSEYNZADA");
		
		L14_Address address1 = new L14_Address(1000, "H.Cavid 101", "Yasamal", "Baku");
		L14_Address address2 = new L14_Address(1000, "H.Cavid 102", "Yasamal", "Baku");
		L14_Address address3 = new L14_Address(1000, "H.Cavid 103", "Yasamal", "Baku");
		L14_Address address4 = new L14_Address(1000, "H.Cavid 104", "Yasamal", "Baku");
		L14_Address address5 = new L14_Address(1000, "H.Cavid 105", "Yasamal", "Baku");
		L14_Address address6 = new L14_Address(1000, "H.Cavid 106", "Yasamal", "Baku");
		
		student1.getAddresses().add(address1);
		student1.getAddresses().add(address2);
		student2.getAddresses().add(address3);
		student2.getAddresses().add(address4);
		student3.getAddresses().add(address5);
		student3.getAddresses().add(address6);		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();		
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityTransaction.commit();
		
		System.out.println("**************************THE END************************************************");	
		
	}

}
