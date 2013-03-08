package mx.com.cse.web.MB;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import mx.com.cse.Core.ServiciosImpl.UsuarioServiceImpl;

import org.primefaces.model.MenuModel;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 17/02/2013
 * Clase del home 
 */
@ManagedBean(name="homeMB")
@SessionScoped
public class HomeMB implements Serializable{
	@ManagedProperty(value = "#{loginMB}")
	private LoginMB loginSession;
	@ManagedProperty(value = "#{usuarioService}")
	private UsuarioServiceImpl usuarioService;
	private MenuModel menuModel;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @return the loginSession
	 */
	public LoginMB getLoginSession() {
		return loginSession;
	}

	/**
	 * @param loginSession the loginSession to set
	 */
	public void setLoginSession(LoginMB loginSession) {
		this.loginSession = loginSession;
	}

	/**
	 * @return the menuModel
	 */
	public MenuModel getMenuModel() {
		if(this.menuModel==null){
			menuModel=usuarioService.getMenuModel(loginSession.getLoginSession().getPerfilTO().getIdPerfil());
		}
		return menuModel;
	}

	/**
	 * @param menuModel the menuModel to set
	 */
	public void setMenuModel(MenuModel menuModel) {
		this.menuModel = menuModel;
	}

	/**
	 * @return the usuarioService
	 */
	public UsuarioServiceImpl getUsuarioService() {
		return usuarioService;
	}

	/**
	 * @param usuarioService the usuarioService to set
	 */
	public void setUsuarioService(UsuarioServiceImpl usuarioService) {
		this.usuarioService = usuarioService;
	}

}
