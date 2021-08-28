package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "course")
@Data
public class Course {

	@Id
	@Column(name="course_id")
	private Integer courseId;
	@Column(name="course_name")
	private String courseName;
	
}
