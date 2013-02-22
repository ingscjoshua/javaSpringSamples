package mx.com.cse.TO;

import java.io.Serializable;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 21/02/2013
 */
public class MenuTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idMenu;
	private String nombreMenu;
	private String accionMenu;
	private PerfilTO perfil;
	/**
	 * @return the idMenu
	 */
	public Long getIdMenu() {
		return idMenu;
	}
	/**
	 * @param idMenu the idMenu to set
	 */
	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
	}
	/**
	 * @return the nombreMenu
	 */
	public String getNombreMenu() {
		return nombreMenu;
	}
	/**
	 * @param nombreMenu the nombreMenu to set
	 */
	public void setNombreMenu(String nombreMenu) {
		this.nombreMenu = nombreMenu;
	}
	/**
	 * @return the accionMenu
	 */
	public String getAccionMenu() {
		return accionMenu;
	}
	/**
	 * @param accionMenu the accionMenu to set
	 */
	public void setAccionMenu(String accionMenu) {
		this.accionMenu = accionMenu;
	}
	/**
	 * @return the perfil
	 */
	public PerfilTO getPerfil() {
		return perfil;
	}
	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(PerfilTO perfil) {
		this.perfil = perfil;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMenu == null) ? 0 : idMenu.hashCode());
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
		MenuTO other = (MenuTO) obj;
		if (idMenu == null) {
			if (other.idMenu != null)
				return false;
		} else if (!idMenu.equals(other.idMenu))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MenuTO [idMenu=" + idMenu + ", nombreMenu=" + nombreMenu
				+ ", accionMenu=" + accionMenu + ", perfil=" + perfil + "]";
	}
	
}
