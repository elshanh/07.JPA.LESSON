package eh.project.l01.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "L09_STUDENT")
public class L09_Student {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.AUTO)    // Bir cedvel yaradir (hibernate_sequence ) 1-den baslayir ID-ler orda saxlanilir her defe artirilir
	//@GeneratedValue(strategy = GenerationType.IDENTITY) // Cedvel yaratmadan 1-den baslayir tekrar olunmayacaq sekilde ID-ler yaradir
	//@GeneratedValue(strategy = GenerationType.TABLE) // Bir cedvel yaradir (hibernate_sequences => iki sutun var (sequence_name,next_val) 
																						    //sequence_name her cedvelin adi ve next_val her cedlevin ID deyeri) 1-den baslayir ID-ler orda saxlanilir her defe artirilir
	private int studentId;
	
	@Column(name = "NAME",length = 20,nullable = true)
	private String studentName;
	
	@Column(name = "SURNAME",length = 20,nullable = true)
	private String studentSurname;
	
	@Column(name = "NUMBER",length = 10,updatable = false,nullable = true)
	private int studentNumber;
	
	@Column(name = "FACULITY",length = 100,nullable = true)
	private String studentFaculity;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REG_DATE",nullable = true)
	private Date studentRegDate;
	
	public L09_Student() {
		
	}

	public L09_Student(String studentName, String studentSurname, int studentNumber, String studentFaculity,Date studentRegDate) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.studentNumber = studentNumber;
		this.studentFaculity = studentFaculity;
		this.studentRegDate = studentRegDate;
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

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentFaculity() {
		return studentFaculity;
	}

	public void setStudentFaculity(String studentFaculity) {
		this.studentFaculity = studentFaculity;
	}

	public Date getStudentRegDate() {
		return studentRegDate;
	}

	public void setStudentRegDate(Date studentRegDate) {
		this.studentRegDate = studentRegDate;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname=" + studentSurname
				+ ", studentNumber=" + studentNumber + ", studentFaculity=" + studentFaculity + ", studentRegDate="
				+ studentRegDate + "]";
	}
	
	
	

}
