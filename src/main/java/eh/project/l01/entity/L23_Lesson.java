package eh.project.l01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "L23_LESSON")
public class L23_Lesson {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lessonId;
	
	@Column(name = "NAME")
	private String lessonName;
	
	public L23_Lesson() {
		
	}

	public L23_Lesson(String lessonName) {
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

	@Override
	public String toString() {
		return "L23_Lesson [lessonId=" + lessonId + ", lessonName=" + lessonName + "]";
	}

}
