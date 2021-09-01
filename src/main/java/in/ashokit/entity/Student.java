package in.ashokit.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class Student {

	@NotEmpty
	private String studentName;

	@NotEmpty
	@Email
	private String studentEmail;

	private String studentContact;

	private String studentGender;

	private String studentCourse;

	private String[] courseTimings;

}
