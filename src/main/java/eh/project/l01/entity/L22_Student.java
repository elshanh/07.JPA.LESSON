package eh.project.l01.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
@Table(name = "L22_STUDENT")
public class L22_Student {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column(name = "NAME")
	private String studentName;
	
	@Column(name = "SURNAME")
	private String studentSurname;
	
	
	@OneToMany(mappedBy = "students")
	private List<L22_Lesson> studentLessons = new ArrayList<L22_Lesson>();


	public L22_Student() {
		
	}
	
	public L22_Student(String studentName, String studentSurname) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}
	
	public void addLesson(L22_Lesson lesson) {
		this.studentLessons.add(lesson);
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

	public List<L22_Lesson> getLessons() {
		return studentLessons;
	}

}
