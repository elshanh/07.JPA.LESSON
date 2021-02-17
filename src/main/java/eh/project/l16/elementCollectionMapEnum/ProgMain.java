package eh.project.l16.elementCollectionMapEnum;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L16_Student;

public class ProgMain {
	
	public static void main(String[] args) {
		
		L16_Student student1 = new L16_Student("Elshan", "HUSEYNZADA");
		
		student1.getPhoneNumbers().put(PhoneType.Home,"012-333-44-55");
		student1.addPhoneNumber(PhoneType.Mobil, "050-333-44-55");
		student1.addPhoneNumber(PhoneType.Work, "055-333-44-55");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();		
		entityManager.persist(student1);
		entityTransaction.commit();
		
		System.out.println("**************************THE END************************************************");	
		
	}

}
