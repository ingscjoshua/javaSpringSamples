package mx.com.cse.web.MB;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import mx.com.cse.Core.Servicios.UsuarioService;
import mx.com.cse.Core.ServiciosImpl.UsuarioServiceImpl;
import mx.com.cse.TO.LoginTO;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com 16/02/2013
 */
@ManagedBean(name = "loginMB")
@SessionScoped
public class LoginMB implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{usuarioService}")
	private UsuarioService usuarioService;
	private LoginTO loginSession;
	private String usuario;
	private String password;
	private FacesContext context;
	private FacesMessage facesMessage;
	private String navigation;

	/**
	 * metodo que valida el acceso al sistema, carga el perfil y menu del usuario que se cargara
	 */
	public String loginSubmit() {
		
		loginSession = usuarioService.getLogin(usuario, password);
		if(loginSession!=null){
			if(loginSession.getPasswordLogin().equals(password.trim())){
				navigation="/xhtml/home";
			}
			else{
				facesMessage=  new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Contraseña incorrecta");
				navigation="index";
				context=FacesContext.getCurrentInstance();
				context.addMessage(null, facesMessage);
			}
		}else{
			facesMessage=  new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Usuario incorrecto");
			navigation="index";
			context=FacesContext.getCurrentInstance();
			context.addMessage(null, facesMessage);
		}
		return navigation;
	}

	/**
	 * @return the loginSession
	 */
	public LoginTO getLoginSession() {
		return loginSession;
	}

	/**
	 * @param loginSession
	 *            the loginSession to set
	 */
	public void setLoginSession(LoginTO loginSession) {
		this.loginSession = loginSession;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the usuarioService
	 */
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	/**
	 * @param usuarioService the usuarioService to set
	 */
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

}
