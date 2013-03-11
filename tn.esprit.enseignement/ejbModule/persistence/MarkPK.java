package persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class MarkPK implements Serializable {

	private int idStu;
	private int idMod;
	private Date dateOf;

	public int getIdStu() {
		return idStu;
	}

	public void setIdStu(int idStu) {
		this.idStu = idStu;
	}

	public int getIdMod() {
		return idMod;
	}

	public void setIdMod(int idMod) {
		this.idMod = idMod;
	}

	public Date getDateOf() {
		return dateOf;
	}

	public void setDateOf(Date dateOf) {
		this.dateOf = dateOf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOf == null) ? 0 : dateOf.hashCode());
		result = prime * result + idMod;
		result = prime * result + idStu;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarkPK other = (MarkPK) obj;
		if (dateOf == null) {
			if (other.dateOf != null)
				return false;
		} else if (!dateOf.equals(other.dateOf))
			return false;
		if (idMod != other.idMod)
			return false;
		if (idStu != other.idStu)
			return false;
		return true;
	}

	public MarkPK() {
		// TODO Auto-generated constructor stub
	}

	public MarkPK(int idStu, int idMod, Date dateOf) {
		super();
		this.idStu = idStu;
		this.idMod = idMod;
		this.dateOf = dateOf;
	}

}
