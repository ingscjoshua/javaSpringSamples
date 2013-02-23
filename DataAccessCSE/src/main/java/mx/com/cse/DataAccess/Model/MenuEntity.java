package mx.com.cse.DataAccess.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 21/02/2013
 */
@Entity
@Table(name="MENU")
@NamedQueries({@NamedQuery(name="MenuEntity.getMEnusByPerfil",query="FROM MenuEntity WHERE perfil.idPerfil=:idPerfil")})
public class MenuEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="idMenu")
	private Long idMenu;
	@Column(name="NOMBRE_MENU")
	private String nombreMenu;
	@Column(name="ACCION_MENU")
	private String accionMenu;
	@ManyToOne
	@JoinColumn(name="Perfil_idPerfil")
	private PerfilEntity perfil;
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
		MenuEntity other = (MenuEntity) obj;
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
		return "MenuEntity [idMenu=" + idMenu + ", nombreMenu=" + nombreMenu
				+ ", accionMenu=" + accionMenu + ", perfil=" + perfil + "]";
	}

}
