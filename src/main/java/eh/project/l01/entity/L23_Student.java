package eh.project.l01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "L23_STUDENT")
public class L23_Student {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column(name = "NAME")
	private String studentName;
	
	@Column(name = "SURNAME")
	private String studentSurname;
	
	@ManyToOne
	@JoinColumn(name = "lessonId")
	private L23_Lesson lesson;
	

	public L23_Student() {
		
	}

	public L23_Student(String studentName, String studentSurname) {
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

	public L23_Lesson getLesson() {
		return lesson;
	}

	public void setLesson(L23_Lesson lesson) {
		this.lesson = lesson;
	}

	@Override
	public String toString() {
		return "L23_Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname="
				+ studentSurname + "]";
	}
}
