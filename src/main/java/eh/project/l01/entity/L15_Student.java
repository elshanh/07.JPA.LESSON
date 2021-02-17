package eh.project.l01.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "L15_STUDENT")
public class L15_Student {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(name = "NAME",length = 20,nullable = true)
	private String studentName;
	
	@Column(name = "SURNAME",length = 20,nullable = true)
	private String studentSurname;
	
	@ElementCollection
	@CollectionTable(name = "L15_STUDENT_PHONE_NUMBER",joinColumns = @JoinColumn(name = "STUDENT_ID"))
	@MapKeyColumn(name = "PHONE_TYPE")
	@Column(name = "PHONE_NUMBER")
	private Map<String,String> phoneNumbers = new HashMap<String, String>();
	
	public L15_Student() {

	}

	
	public L15_Student(String studentName, String studentSurname) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}

	public void addPhoneNumber(String key,String value) {
		this.phoneNumbers.put(key, value);
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


	public Map<String, String> getPhoneNumbers() {
		return phoneNumbers;
	}


	public void setPhoneNumbers(Map<String, String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname=" + studentSurname
				+ ", phoneNumbers=" + phoneNumbers + "]";
	}

}
