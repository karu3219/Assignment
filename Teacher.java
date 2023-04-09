package AssignmentManagementSystem;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
	private int teacher_id;
	private String teacher_name;
	
	@OneToMany(mappedBy="teacher_Id")
	private List<Assignment> Assignments= new ArrayList<>();
	
	public List<Assignment> getAssignments() {
		return Assignments;
	}
	public void setAssignments(List<Assignment> assignments) {
		Assignments = assignments;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	
	
}
