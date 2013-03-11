package services.interfaces;

import java.util.List;

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

	void assignProfsToModule(List<Prof> profs, Module module);

	Prof findProfById(int i);

	Module findModuleById(int i);
}
