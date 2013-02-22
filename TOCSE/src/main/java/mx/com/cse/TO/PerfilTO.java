package mx.com.cse.TO;

import java.io.Serializable;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 21/02/2013
 */
public class PerfilTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idPerfil;
	private String nombrePerfil;
	/**
	 * @return the idPerfil
	 */
	public Long getIdPerfil() {
		return idPerfil;
	}
	/**
	 * @param idPerfil the idPerfil to set
	 */
	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}
	/**
	 * @return the nombrePerfil
	 */
	public String getNombrePerfil() {
		return nombrePerfil;
	}
	/**
	 * @param nombrePerfil the nombrePerfil to set
	 */
	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPerfil == null) ? 0 : idPerfil.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PerfilTO other = (PerfilTO) obj;
		if (idPerfil == null) {
			if (other.idPerfil != null)
				return false;
		} else if (!idPerfil.equals(other.idPerfil))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PerfilTO [idPerfil=" + idPerfil + ", nombrePerfil="
				+ nombrePerfil + "]";
	}
	
	
}
