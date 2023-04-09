package AssignmentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class CreateStudent 
{
	List<Student> allStudents = new ArrayList<>();
	public Student addmission(int student_id,String student_name,char section)
	{
		Student student = new Student();
		student.setStudent_id(student_id);
		student.setStudent_name(student_name);
		student.setSection(section);
		allStudents.add(student);
		return student;
	}
}
