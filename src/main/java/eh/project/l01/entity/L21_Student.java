package eh.project.l01.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "L21_STUDENT")
public class L21_Student {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(name = "NAME")
	private String studentName;
	
	@Column(name = "SURNAME")
	private String studentSurname;
	
	
	@OneToMany
	@JoinTable(name = "L21_STUDENT_LESSON", joinColumns = @JoinColumn(name = "studentId"), inverseJoinColumns = @JoinColumn(name = "lessonId"))
	private List<L21_Lesson> lessons;


	public L21_Student() {
		
	}
	
	public L21_Student(String studentName, String studentSurname) {
		this.studentName = studentName;
		this.studentSurname = studentSurname;
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

	public List<L21_Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(List<L21_Lesson> lessons) {
		this.lessons = lessons;
	}

}
