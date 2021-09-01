package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class StudentEntity {

	@Id
	@GeneratedValue
	@Column(name = "std_id")
	private Integer studentId;
	@Column(name = "std_name")
	private String studentName;
	@Column(name = "std_email")
	private String studentEmail;
	@Column(name = "std_contact")
	private String studentContact;
	@Column(name = "std_gender")
	private String studentGender;
	@Column(name = "std_course")
	private String studentCourse;
	@Column(name = "course_timings")
	private String[] courseTimings;

}
