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
@Table(name = "L14_STUDENT")
public class L14_Student {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(name = "NAME",length = 20,nullable = true)
	private String studentName;
	
	@Column(name = "SURNAME",length = 20,nullable = true)
	private String studentSurname;
	
	@ElementCollection
	@CollectionTable(name = "L14_STUDENT_ADDRESS",joinColumns = @JoinColumn(name = "STUDENT_ID"))
	private List<L14_Address> addresses = new ArrayList<L14_Address>();
	
	public L14_Student() {

	}

	
	public L14_Student(String studentName, String studentSurname) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}
	
	public void addAddress(L14_Address address) {
		this.addresses = addresses;
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


	public List<L14_Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<L14_Address> addresses) {
		this.addresses = addresses;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname=" + studentSurname
				+ ", addresses=" + addresses + "]";
	}
}
