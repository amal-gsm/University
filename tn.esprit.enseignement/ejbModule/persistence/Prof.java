package persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Prof
 *
 */
@Entity

public class Prof implements Serializable {

	
	private int idProf;
	private String nameProf;
	private static final long serialVersionUID = 1L;
	
	private Module module;

	public Prof() {
		super();
	}   
	@Id    
	public int getIdProf() {
		return this.idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}   
	public String getNameProf() {
		return this.nameProf;
	}

	public void setNameProf(String nameProf) {
		this.nameProf = nameProf;
	}
	@ManyToOne
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
   
}
