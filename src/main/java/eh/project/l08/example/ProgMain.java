package eh.project.l08.example;

import java.util.Date;

import eh.project.l01.entity.L04_Student;
import eh.project.l08.example.Repository;
import eh.project.l08.example.RepositoryImpl;

public class ProgMain {

	public static void main(String[] args) {
		
		Repository repository = new RepositoryImpl();
		
		
		//************************INSERT
		L04_Student student1Insert = new L04_Student(1,"Irade", "HUSEYNZADA", 123451, "Doctor", new Date());
		L04_Student student2Insert = new L04_Student(2,"Akif", "HUSEYNZADA", 123452, "Economic", new Date());
		L04_Student student3Insert = new L04_Student(3,"Fidan", "HUSEYNZADA", 123453, "Teacher", new Date());
		L04_Student student4Insert = new L04_Student(4,"DeleteName", "DeleteSURNAME", 123454, "Teacher", new Date());
		
		repository.save(student1Insert);
		repository.save(student2Insert);
		repository.save(student3Insert);
		repository.save(student4Insert);
		
		//************************SELECT
		L04_Student studentSelect = new L04_Student();
		System.out.println("**************************SELECT BEGIN************************************************");
		for (byte b = 1; b < 5; b ++) {
			studentSelect = repository.find(b);
			if (studentSelect != null) {
				System.out.println(b + " " + studentSelect.getStudentNumber() + " " + studentSelect.getStudentName() + " " + studentSelect.getStudentSurname() + " " + studentSelect.getStudentFaculity());
			}else {
				System.out.println("Student data not found !");
			}
		}
		System.out.println("**************************SELECT END************************************************");
		
		//************************UPDATE
		L04_Student studentUpdate = repository.find(3); 
		studentUpdate.setStudentFaculity("Economic");
		repository.update(studentUpdate);
		
		//************************DELETE
		L04_Student studentDelete = repository.find(4); 
		repository.delete(studentDelete);
		
		//************************THE END
		L04_Student studentSelectAll = new L04_Student();
		System.out.println("**************************THE END************************************************");
		for (byte b = 1; b < 4; b ++) {
			studentSelectAll = repository.find(b);
			if (studentSelectAll != null) {
				System.out.println(b + " " + studentSelectAll.getStudentNumber() + " " + studentSelectAll.getStudentName() + " " + studentSelectAll.getStudentSurname() + " " + studentSelectAll.getStudentFaculity());
			}else {
				System.out.println("Student data not found !");
			}
		}		
	}
}
