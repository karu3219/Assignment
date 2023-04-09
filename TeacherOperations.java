package AssignmentManagementSystem;

import java.util.List;

public class TeacherOperations {
	
	public Teacher getTeacher(int teacherId)
	{
		CreateTeacher ct = new CreateTeacher();
		List<Teacher> allTeachers = ct.allTeachers;
		for(Teacher teacher : allTeachers)
		{
			if(teacherId==teacher.getTeacher_id())
			{
				return teacher;
			}
		}
		return null;
	}
}
