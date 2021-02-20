package eh.project.l01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "L22_LESSON")
public class L22_Lesson {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lessonId;
	
	@Column(name = "NAME")
	private String lessonName;
	
	@ManyToOne
	@JoinColumn(name = "studentId")
	private L22_Student students;
	
	public L22_Lesson() {

	}
	
	public L22_Lesson(String lessonName) {
		this.lessonName = lessonName;
	}

	public int getLessonId() {
		return lessonId;
	}

	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public L22_Student getStudents() {
		return students;
	}

	public void setStudents(L22_Student students) {
		this.students = students;
	}

}
