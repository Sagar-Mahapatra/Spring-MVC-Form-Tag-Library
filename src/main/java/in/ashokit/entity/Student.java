package in.ashokit.entity;

import lombok.Data;

@Data
public class Student {

	private Integer studentId;

	private String studentName;

	private String studentEmail;

	private String studentContact;

	private String studentGender;

	private String studentCourse;

	private String[] courseTimings;

}
