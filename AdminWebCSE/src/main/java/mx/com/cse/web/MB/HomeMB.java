package mx.com.cse.web.MB;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 17/02/2013
 * Clase del home 
 */
@ManagedBean(name="homeMB")
@Component
@Controller
@Scope(value="session")
public class HomeMB implements Serializable{
	@Inject
	private LoginMB loginSession;
	/**
	 * Constructor de la clase
	 */
	public HomeMB() {
		

	}

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

}
