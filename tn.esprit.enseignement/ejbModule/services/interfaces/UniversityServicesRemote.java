package services.interfaces;

import javax.ejb.Remote;

import persistence.Module;
import persistence.Prof;
import persistence.Student;

@Remote
public interface UniversityServicesRemote {
	void addStudent(Student student);

	void addModule(Module module);

	void addProf(Prof prof);

	void fokkAlia();
}
