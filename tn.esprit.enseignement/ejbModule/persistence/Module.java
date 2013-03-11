package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Module
 * 
 */
@Entity
public class Module implements Serializable {

	private int idModule;
	private String nameModule;
	private static final long serialVersionUID = 1L;

	private List<Mark> marks;
	private List<Prof> profs;

	public Module() {
		super();
	}

	@Id
	public int getIdModule() {
		return this.idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	public String getNameModule() {
		return this.nameModule;
	}

	public void setNameModule(String nameModule) {
		this.nameModule = nameModule;
	}

	@OneToMany(mappedBy = "module")
	public List<Mark> getMarks() {
		return marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	@OneToMany(mappedBy = "module",cascade=CascadeType.MERGE)
	public List<Prof> getProfs() {
		return profs;
	}

	public void setProfs(List<Prof> profs) {
		this.profs = profs;
	}

	public void linkProfsToModule(List<Prof> profs2) {
		this.profs = profs2;
		for (Prof p : profs2) {
			p.setModule(this);
		}

	}

}
