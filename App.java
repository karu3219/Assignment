package AssignmentManagementSystem;

import org.hibernate.Session;

public class App 
{
	public static void main(String args[])
	{
		Student st1 = new Student();
		Student st2 = new Student();
		
//		st1.setStudent_id(4055);
//		st1.setStudent_name("karthik");
//		st1.setSection('D');
//		
//		st2.setStudent_id(4058);
//		st2.setStudent_name("Dhinesh");
//		st2.setSection('D');
		Student_Operations so = new Student_Operations();
		Assignment assignment=so.createOperation(21, 4058, "DSA", null, null, "2023-04-01", "2023-04-01", null);
		
		
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();
		
		teacher1.setTeacher_id(1023);
		teacher1.setTeacher_name("Ramesh hunugur");
		
		teacher2.setTeacher_id(1024);
		teacher2.setTeacher_name("Krishna prasadh");
		Hibernate_Configuaration hc = new Hibernate_Configuaration();
		Session session=hc.startSession();
		
		session.beginTransaction();
		if(assignment!=null)
		session.save(assignment);
//		session.save(st1);
//		session.save(st2);
		session.getTransaction().commit();
		session.close();
	}
}
