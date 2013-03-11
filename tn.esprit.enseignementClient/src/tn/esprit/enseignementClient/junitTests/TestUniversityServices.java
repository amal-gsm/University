package tn.esprit.enseignementClient.junitTests;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Before;
import org.junit.Test;

import persistence.Module;
import persistence.Prof;
import persistence.Student;
import services.interfaces.UniversityServicesRemote;

public class TestUniversityServices {
	private Context context;
	private UniversityServicesRemote proxy;

	@Before
	public void setUp() throws Exception {
		context = new InitialContext();
		proxy = (UniversityServicesRemote) context
				.lookup("tn.esprit.enseignement/UniversityServices!services.interfaces.UniversityServicesRemote");

	}

	@Test
	public void testInitDB() {

		Student student = new Student();
		student.setIdStudent(1);
		student.setNameStudent("Amal");

		Student student2 = new Student();
		student2.setIdStudent(2);
		student2.setNameStudent("Mouna");

		Student student3 = new Student();
		student3.setIdStudent(3);
		student3.setNameStudent("Taieb");

		Module module = new Module();
		module.setIdModule(1);
		module.setNameModule("JEE");

		Module module2 = new Module();
		module2.setIdModule(2);
		module2.setNameModule("dot net");

		Prof prof = new Prof();
		prof.setIdProf(1);
		prof.setNameProf("syrine");

		Prof prof2 = new Prof();
		prof2.setIdProf(2);
		prof2.setNameProf("karim");

		Prof prof3 = new Prof();
		prof3.setIdProf(3);
		prof3.setNameProf("rabeb");

		proxy.addStudent(student);
		proxy.addStudent(student2);
		proxy.addStudent(student3);

		proxy.addModule(module);
		proxy.addModule(module2);

		proxy.addProf(prof);
		proxy.addProf(prof2);
		proxy.addProf(prof3);

	}

	@Test
	public void testAssignProfsToModule() {

		List<Prof> profs = new ArrayList<Prof>();
		List<Prof> profs2 = new ArrayList<Prof>();

		Prof prof = proxy.findProfById(1);
		Prof prof2 = proxy.findProfById(2);
		Prof prof3 = proxy.findProfById(3);

		profs.add(prof);
		profs.add(prof2);

		profs2.add(prof3);

		Module module = proxy.findModuleById(1);
		Module module2 = proxy.findModuleById(2);

		proxy.assignProfsToModule(profs, module);
		proxy.assignProfsToModule(profs2, module2);
	}

}
