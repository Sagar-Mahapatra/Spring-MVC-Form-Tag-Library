package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="course_timing")
@Data
public class CourseTiming {

	@Id
	@Column(name="timing_id")
	private Integer timingId;
	@Column(name="course_time")
	private String courseTime;
	
}
