package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistence.Module;
import persistence.Prof;
import persistence.Student;
import services.interfaces.UniversityServicesRemote;

/**
 * Session Bean implementation class UniversityServices
 */
@Stateless
public class UniversityServices implements UniversityServicesRemote {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UniversityServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);

	}

	@Override
	public void addModule(Module module) {
		entityManager.persist(module);
	}

	@Override
	public void addProf(Prof prof) {
		entityManager.persist(prof);
	}

	@Override
	public void fokkAlia() {
		// TODO Auto-generated method stub

	}

	@Override
	public void assignProfsToModule(List<Prof> profs, Module module) {
		module.linkProfsToModule(profs);
		entityManager.merge(module);

	}

	@Override
	public Prof findProfById(int i) {
		return entityManager.find(Prof.class, i);
	}

	@Override
	public Module findModuleById(int i) {
		return entityManager.find(Module.class, i);
	}

}
