package AssignmentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class CreateTeacher 
{
	List<Teacher> allTeachers = new ArrayList<>();
	public Teacher addmission(int Teacher_id,String student_name)
	{
		Teacher teacher = new Teacher();
		teacher.setTeacher_id(Teacher_id);
		teacher.setTeacher_name(student_name);
		
		allTeachers.add(teacher);
		return teacher;
	}
}
