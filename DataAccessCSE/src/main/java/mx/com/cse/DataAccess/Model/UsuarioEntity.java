package mx.com.cse.DataAccess.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com 06/02/2013 Mapeo de Entidad ala tabla USUARIO
 */
@Entity
@Table(name = "USUARIO")
@NamedQueries({
		@NamedQuery(name = "UsuarioEntity.getAllUsuarios", query = "FROM UsuarioEntity"),
		@NamedQuery(name = "UsuarioEntity.getUsuario", query = "FROM UsuarioEntity u WHERE u.nomUsuario=:nomUsuario") })
public class UsuarioEntity  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "ID_USUARIO")
	private Long idUsuario;
	@Column(name = "NOMBRE")
	private String nomUsuario;
	@Column(name = "APELLIDO")
	private String apellidoPatero;
	

	/**
	 * @return the nomUsuario
	 */
	public String getNomUsuario() {
		return nomUsuario;
	}

	/**
	 * @param nomUsuario
	 *            the nomUsuario to set
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
	 * @param apellidoPatero
	 *            the apellidoPatero to set
	 */
	public void setApellidoPatero(String apellidoPatero) {
		this.apellidoPatero = apellidoPatero;
	}

	/**
	 * @return the idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario
	 *            the idUsuario to set
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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
		UsuarioEntity other = (UsuarioEntity) obj;
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
		return "UsuarioEntity [idUsuario=" + idUsuario + ", nomUsuario="
				+ nomUsuario + ", apellidoPatero=" + apellidoPatero + "]";
	}



}
