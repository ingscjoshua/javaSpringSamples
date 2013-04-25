package mx.com.cse.web.MB.Usuarios;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import mx.com.cse.Core.Servicios.UsuarioService;
import mx.com.cse.TO.UsuarioTO;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 27/02/2013
 * MB que controla la las acciones de la creacion de usuarios
 */
@ManagedBean(name="usuarioMB")
@ViewScoped
public class UsarioPrincipalMB implements Serializable{
	private FacesContext context;
	private FacesMessage facesMessage;
	private String navigation;
	@ManagedProperty(value = "#{usuarioService}")
	private UsuarioService usuarioService;
	private UsuarioTO usuarioTO;
	private List<UsuarioTO>listUsuarios;
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
	 * Método que obtiene la lista de usuarios en base al filtro.
	 */
	public void obtenerUsuariosPorFiltro(ActionEvent event ){
		listUsuarios=usuarioService.obtenerUsuarios(usuarioTO);
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
	/**
	 * @return the listUsuarios
	 */
	public List<UsuarioTO> getListUsuarios() {
		return listUsuarios;
	}
	/**
	 * @param listUsuarios the listUsuarios to set
	 */
	public void setListUsuarios(List<UsuarioTO> listUsuarios) {
		this.listUsuarios = listUsuarios;
	}
	
	

}
