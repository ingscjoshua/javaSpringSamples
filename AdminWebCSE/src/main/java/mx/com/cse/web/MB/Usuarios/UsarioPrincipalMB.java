package mx.com.cse.web.MB.Usuarios;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 27/02/2013
 */
@ManagedBean(name="usuarioMB")
@Component
@Controller
@ViewScoped
public class UsarioPrincipalMB implements Serializable{
	private FacesContext context;
	private FacesMessage facesMessage;
	private String navigation;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

}
