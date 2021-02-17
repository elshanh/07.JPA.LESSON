package eh.project.l05.select;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eh.project.l01.entity.L04_Student;

public class ProgMain {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager = factory.createEntityManager();
		
		L04_Student student =  entityManager.find(L04_Student.class, 1);
		
		System.out.println("------------------------------------------------------------------------");	
		
		if (student != null) {
			System.out.println(student.getStudentNumber());
			System.out.println(student.getStudentName());
			System.out.println(student.getStudentSurname());
			System.out.println(student.getStudentFaculity());
			System.out.println(student.getStudentRegDate());			
		}else {
			System.out.println("Data not Found");
		}

	}
}
