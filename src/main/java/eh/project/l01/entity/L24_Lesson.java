package eh.project.l01.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "L24_LESSON")
public class L24_Lesson {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lessonId;
	
	@Column(name = "NAME")
	private String lessonName;
	
	@OneToMany(mappedBy = "lesson")
	private List<L24_Student> students;
	
	public L24_Lesson() {
		
	}

	public L24_Lesson(String lessonName) {
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
	
	public List<L24_Student> getStudents() {
		return students;
	}

	public void setStudents(List<L24_Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "L24_Lesson [lessonId=" + lessonId + ", lessonName=" + lessonName + "]";
	}

}
