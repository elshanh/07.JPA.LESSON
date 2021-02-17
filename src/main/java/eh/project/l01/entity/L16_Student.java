package eh.project.l01.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.Table;

import eh.project.l16.elementCollectionMapEnum.PhoneType;

@Entity
@Table(name = "L16_STUDENT")
public class L16_Student {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(name = "NAME",length = 20,nullable = true)
	private String studentName;
	
	@Column(name = "SURNAME",length = 20,nullable = true)
	private String studentSurname;
	
	@ElementCollection
	@CollectionTable(name = "L16_STUDENT_PHONE_NUMBER",joinColumns = @JoinColumn(name = "STUDENT_ID"))
	@MapKeyColumn(name = "PHONE_TYPE")
	@MapKeyEnumerated(EnumType.STRING) //Bu hisse qeyd olunduqda Bazada enum-da qeyd olunan adlar gorunur. eks halda 0,1 ve s kimi qeyd olunur
	@Column(name = "PHONE_NUMBER")
	private Map<PhoneType,String> phoneNumbers = new HashMap<PhoneType, String>();
	
	public L16_Student() {

	}
	
	public L16_Student(String studentName, String studentSurname) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}
	
	public void addPhoneNumber(PhoneType phoneType,String phoneNumber) {
		this.phoneNumbers.put(phoneType, phoneNumber);
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

	public Map<PhoneType, String> getPhoneNumbers() {
		return phoneNumbers;
	}

}
