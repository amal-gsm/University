package persistence;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Mark
 * 
 */
@Entity
public class Mark implements Serializable {

	private MarkPK markPK;
	private int theMark;
	private String Type;
	private static final long serialVersionUID = 1L;

	private Student student;
	private Module module;

	public Mark() {
		super();
	}

	@EmbeddedId
	public MarkPK getMarkPK() {
		return markPK;
	}

	public void setMarkPK(MarkPK markPK) {
		this.markPK = markPK;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getTheMark() {
		return this.theMark;
	}

	public void setTheMark(int theMark) {
		this.theMark = theMark;
	}

	public String getType() {
		return this.Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	@ManyToOne
	@JoinColumn(name = "idStu", referencedColumnName = "idStudent", insertable = false, updatable = false)
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@ManyToOne
	@JoinColumn(name = "idMod", referencedColumnName = "idModule", insertable = false, updatable = false)
	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}
