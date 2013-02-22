package mx.com.cse.TO;

import java.io.Serializable;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 15/02/2013
 * Clase utilitaria Tranporte de objetos en tre capas 
 * 
 * 
 */
public class LoginTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idLogin;
	private String usuarioLogin;
	private String passwordLogin;
	private UsuarioTO usuarioTO;
	private PerfilTO perfilTO;
	/**
	 * @return the perfil
	 */
	public PerfilTO getPerfilTO() {
		return perfilTO;
	}
	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfilTO(PerfilTO perfilTO) {
		this.perfilTO = perfilTO;
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
	 * @return the usuario
	 */
	public UsuarioTO getUsuarioTO() {
		return usuarioTO;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuarioTO(UsuarioTO usuario) {
		this.usuarioTO = usuario;
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
		LoginTO other = (LoginTO) obj;
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
		return "LoginTO [idLogin=" + idLogin + ", usuarioLogin=" + usuarioLogin
				+ ", passwordLogin=" + passwordLogin +"Usuario= "+usuarioTO.toString()+"Perfil="+perfilTO.toString()+"]";
	}
}
