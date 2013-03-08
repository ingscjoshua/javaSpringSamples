package mx.com.cse.web.MB.Usuarios;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import mx.com.cse.Core.ServiciosImpl.UsuarioServiceImpl;
import mx.com.cse.TO.UsuarioTO;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 27/02/2013
 * MB que controla la las acciones de la creacion de usuarios
 */
@ManagedBean(name="usuarioMB")
@SessionScoped
public class UsarioPrincipalMB implements Serializable{
	private FacesContext context;
	private FacesMessage facesMessage;
	private String navigation;
	@ManagedProperty(value = "#{usuarioService}")
	private UsuarioServiceImpl usuarioService;
	private UsuarioTO usuarioTO;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constructor de la clase 
	 * aqui se inicializan los parametros que se necesitan
	 */
	public UsarioPrincipalMB() {
		this.usuarioTO= new UsuarioTO();
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
	/**
	 * @return the usuarioTO
	 */
	public UsuarioTO getUsuarioTO() {
		return usuarioTO;
	}
	/**
	 * @param usuarioTO the usuarioTO to set
	 */
	public void setUsuarioTO(UsuarioTO usuarioTO) {
		this.usuarioTO = usuarioTO;
	}
	
	

}
