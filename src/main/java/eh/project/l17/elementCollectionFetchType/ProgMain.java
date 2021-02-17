package eh.project.l17.elementCollectionFetchType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L17_Student;


public class ProgMain {
	
	public static void main(String[] args) {
		
		int control = 1;
		
		if (control == 0) {
			System.out.println("**************************INSERT THE START************************************************");
			insert();
			System.out.println("**************************INSERT THE END************************************************");
		}
		if (control == 1) {
			System.out.println("**************************SELECT THE START************************************************");
			select();
			System.out.println("**************************SELECT THE END************************************************");
		}		
	}
	
	public static void insert() {
		
		L17_Student student1 = new L17_Student("Irade", "HUSEYNZADA");
		L17_Student student2 = new L17_Student("Akif", "HUSEYNZADA");
		L17_Student student3 = new L17_Student("Fidan", "HUSEYNZADA");
		
		student1.addEmails("irade.huseynzada1@email.com");
		student1.addEmails("irade.huseynzada2@email.com");
		
		student1.getPhoneNumbers().put(PhoneType.Home,"012-333-44-55");
		student1.addPhoneNumber(PhoneType.Mobil, "050-333-44-55");
		student1.addPhoneNumber(PhoneType.Work, "055-333-44-55");
		
		student2.addEmails("akif.huseynzada1@email.com");
		student2.addEmails("akif.huseynzada2@email.com");
		
		student2.getPhoneNumbers().put(PhoneType.Home,"012-444-44-55");
		student2.addPhoneNumber(PhoneType.Mobil, "050-444-44-55");
		
		student3.addEmails("fidan.huseynzada1@email.com");
		student3.addPhoneNumber(PhoneType.Mobil, "050-555-44-55");		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();		
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityTransaction.commit();
	}
	public static void select() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println("**************************SELECT ************************************************");
		
		L17_Student student1 = entityManager.find(L17_Student.class, 1);
		System.out.println("Student Data " + student1);
		/*System.out.println("");
		System.out.println("Student Email Info " + student1.getStudentEmails());
		System.out.println("");
		System.out.println("Student Phone Numbers Info " + student1.getPhoneNumbers());*/

	}	

}