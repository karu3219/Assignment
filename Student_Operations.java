package AssignmentManagementSystem;
import java.util.*;
public class Student_Operations 
{
	public Assignment createOperation(int id,Student student,String assignment_name,String grad,String content,String created_At,String updated_At,String state)
	{
		Assignment assignment = new Assignment();
		assignment.setAssignment_id(id);
		assignment.setAssignment_name(assignment_name);
		assignment.setCreated_At(created_At);
		assignment.setGrad(grad);
		assignment.setState(state);
		assignment.setStudent(student);
		assignment.setUpdated_At(updated_At);
		
		if(content!=null)
		assignment.setContent(content);
		student.getAssignments().add(assignment);
		
		return assignment;
	}
	public Assignment createOperation(int id,int studentId,String assignment_name,String grad,String content,String created_At,String updated_At,String state)
	{
		Student student=getStudent(studentId);

		if(student == null)return null;
		Assignment assignment = new Assignment();
		assignment.setAssignment_id(id);
		assignment.setAssignment_name(assignment_name);
		assignment.setCreated_At(created_At);
		assignment.setGrad(grad);
		assignment.setState(state);
		assignment.setStudent(student);
		assignment.setUpdated_At(updated_At);
		
		if(content!=null)
		assignment.setContent(content);
		
		student.getAssignments().add(assignment);
		return assignment;
	}
	public Assignment editOperation(int ass_id,int st_id,String text)
	{
		Student st=new Student();
		List<Assignment> ls=st.getAssignments();
		Assignment assignment=null;
		for(Assignment ass:ls)
		{
			if(ass_id==ass.getAssignment_id())
			{
				assignment=ass;
				break;
			}
		}
		assignment.setContent(text);
		return assignment;
	}
	public List<Assignment> getAssignments(int std_id)
	{
		CreateStudent cs = new CreateStudent();
		List<Student> allStudents = cs.allStudents;
		for(Student st:allStudents)
		{
			if(st.getStudent_id()==std_id)
			{
				return st.getAssignments();
			}
		}
		return null;
	}
	public void submitAssignmentsToTeacher(int std_id,int teacher_id)
	{
		
		TeacherOperations to = new TeacherOperations();
		
		List<Assignment> assignments=getAssignments(std_id);
		Student student=getStudent(std_id);
		Teacher teacher=to.getTeacher(teacher_id);
		teacher.setAssignments(assignments);
		student.setTeacher(teacher);
		
	}
	public Student getStudent(int studentId)
	{
		CreateStudent cs = new CreateStudent();
	
		List<Student> allStudents = cs.allStudents;
		Student student=null;
		for(Student std:allStudents)
		{
			if(std.getStudent_id()==studentId)
			{
				student=std;
				break;
			}
		}
		return student;
	}
}
