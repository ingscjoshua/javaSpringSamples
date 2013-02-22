package mx.com.cse.TO;

import java.io.Serializable;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 12/02/2013
 */
public class UsuarioTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long idUsuario;
	private String nomUsuario;
	private String apellidoPatero;
	/**
	 * @return the idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}
	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	/**
	 * @return the nomUsuario
	 */
	public String getNomUsuario() {
		return nomUsuario;
	}
	/**
	 * @param nomUsuario the nomUsuario to set
	 */
	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
	/**
	 * @return the apellidoPatero
	 */
	public String getApellidoPatero() {
		return apellidoPatero;
	}
	/**
	 * @param apellidoPatero the apellidoPatero to set
	 */
	public void setApellidoPatero(String apellidoPatero) {
		this.apellidoPatero = apellidoPatero;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idUsuario == null) ? 0 : idUsuario.hashCode());
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
		UsuarioTO other = (UsuarioTO) obj;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UsuarioTO [idUsuario=" + idUsuario + ", nomUsuario="
				+ nomUsuario + ", apellidoPatero=" + apellidoPatero + "]";
	}
	

}
