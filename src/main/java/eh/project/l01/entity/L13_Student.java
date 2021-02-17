package eh.project.l01.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "L13_STUDENT")
public class L13_Student {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column(name = "NAME",length = 20,nullable = true)
	private String studentName;
	
	@Column(name = "SURNAME",length = 20,nullable = true)
	private String studentSurname;
	
	@ElementCollection
	@CollectionTable(name = "L13_STUDENT_PHONE_NUMBERS", joinColumns = @JoinColumn(name = "STUDENT_ID"))
	@Column(name = "PHONE_NUMBER",length = 20,nullable = true)
	private List<String> studentPhoneNumber = new ArrayList<String>();
	
	public L13_Student() {

	}

	public L13_Student(String studentName, String studentSurname, List<String> studentPhoneNumber) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.studentPhoneNumber = studentPhoneNumber;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return studentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	public List<String> getStudentPhoneNumber() {
		return studentPhoneNumber;
	}

	public void setStudentPhoneNumber(List<String> studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname=" + studentSurname
				+ ", studentPhoneNumber=" + studentPhoneNumber + "]";
	}
	
}
