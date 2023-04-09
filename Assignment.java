package AssignmentManagementSystem;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Assignment {
	@Id
	private int assignment_id;
	private String assignment_name;
	private String grad=null;
	private String content="No Text";
	private String created_At;
	private String updated_At;
	private String state="DRAFT ";
	@ManyToOne
	Student student = new Student();
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getAssignment_id() {
		return assignment_id;
	}
	public void setAssignment_id(int assignment_id) {
		this.assignment_id = assignment_id;
	}
	public String getAssignment_name() {
		return assignment_name;
	}
	public void setAssignment_name(String assignment_name) {
		this.assignment_name = assignment_name;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreated_At() {
		return created_At;
	}
	public void setCreated_At(String created_At) {
		this.created_At = created_At;
	}
	public String getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(String updated_At) {
		this.updated_At = updated_At;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
