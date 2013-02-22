package mx.com.cse.DataAccess.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 10/02/2013
 */
@Entity
@Table(name="LOGIN")
@NamedQueries({
	@NamedQuery(name="LoginEntity.getAllLogin",query="FROM LoginEntity"),
	@NamedQuery(name="LoginEntity.getLogin",query="FROM LoginEntity login WHERE login.usuarioLogin=:usuarioLogin")
})
public class LoginEntity  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="ID_LOGIN")
	private Long idLogin;
	@Column(name="USUARIO")
	private String usuarioLogin;
	@Column(name="PASSWORD")
	private String passwordLogin;
	@OneToOne
	@JoinColumn(name="USUARIO_ID_USUARIO")
	private UsuarioEntity usuario;
	@ManyToOne
	@JoinColumn(name="Perfil_idPerfil")
	private PerfilEntity perfil;
	
	
	/**
	 * @return the usuarioLogin
	 */
	public String getUsuarioLogin() {
		return usuarioLogin;
	}
	/**
	 * @param usuarioLogin the usuarioLogin to set
	 */
	public void setUsuarioLogin(String usuarioLogin) {
		this.usuarioLogin = usuarioLogin;
	}
	/**
	 * @return the passwordLogin
	 */
	public String getPasswordLogin() {
		return passwordLogin;
	}
	/**
	 * @param passwordLogin the passwordLogin to set
	 */
	public void setPasswordLogin(String passwordLogin) {
		this.passwordLogin = passwordLogin;
	}

	/**
	 * @return the idLogin
	 */
	public Long getIdLogin() {
		return idLogin;
	}
	/**
	 * @param idLogin the idLogin to set
	 */
	public void setIdLogin(Long idLogin) {
		this.idLogin = idLogin;
	}
	
	/**
	 * @return the usuario
	 */
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the perfil
	 */
	public PerfilEntity getPerfil() {
		return perfil;
	}
	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idLogin == null) ? 0 : idLogin.hashCode());
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
		LoginEntity other = (LoginEntity) obj;
		if (idLogin == null) {
			if (other.idLogin != null)
				return false;
		} else if (!idLogin.equals(other.idLogin))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginEntity [idLogin=" + idLogin + ", usuarioLogin="
				+ usuarioLogin + ", passwordLogin=" + passwordLogin +"Usuario="+usuario.toString()+"Perfil="+perfil.toString()+ "]";
	}
	
	
}
