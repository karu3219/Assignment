package AssignmentManagementSystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class Hibernate_Configuaration 
{
	 Configuration cn;
	 ServiceRegistry reg;
	 SessionFactory sf;
	public Hibernate_Configuaration()
	{
		cn = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Assignment.class).addAnnotatedClass(Teacher.class);
		reg = new ServiceRegistryBuilder().applySettings(cn.getProperties()).buildServiceRegistry();
	    sf=cn.buildSessionFactory(reg);
	}
	public Session startSession()
	{
		return sf.openSession();
	}
	
}
