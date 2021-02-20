package eh.project.l01.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Table(name = "L25_STUDENT")
public class L25_Student {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column(name = "NAME")
	private String studentName;
	
	@Column(name = "SURNAME")
	private String studentSurname;
	
	@Column(name = "BIRTH_OF_DATE")
	@Temporal(TemporalType.DATE)
	private Date studentBirthOfDate;
	
	@ManyToMany
	@JoinTable( name = "L25_STUDENT_COURSE", joinColumns = @JoinColumn(name = "STUDENT_ID"), inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
	private List<L25_Course> courses = new ArrayList<L25_Course>();
	
	
	public L25_Student() {
		
	}

	public L25_Student(String studentName, String studentSurname, Date studentBirthOfDate) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.studentBirthOfDate = studentBirthOfDate;
	}
	
	public void addCourse(L25_Course course) {
		this.courses.add(course);
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

	public Date getStudentBirthOfDate() {
		return studentBirthOfDate;
	}

	public void setStudentBirthOfDate(Date studentBirthOfDate) {
		this.studentBirthOfDate = studentBirthOfDate;
	}

	public List<L25_Course> getCourses() {
		return courses;
	}

	public void setCourses(List<L25_Course> courses) {
		this.courses = courses;
	}

	
}
