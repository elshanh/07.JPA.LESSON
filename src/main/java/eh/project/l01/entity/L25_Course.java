package eh.project.l01.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "L25_COURSE")
public class L25_Course {
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	
	@Column(name = "NAME")
	private String courseName;
	
	@ManyToMany(mappedBy = "courses")
	private List<L25_Student> students;
	
	public L25_Course() {
		
	}

	public L25_Course(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<L25_Student> getStudents() {
		return students;
	}

	public void setStudents(List<L25_Student> students) {
		this.students = students;
	}

	
}
