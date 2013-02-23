package mx.com.cse.Core.Config;

import mx.com.cse.Core.Servicios.UsuarioService;
import mx.com.cse.Core.ServiciosImpl.UsuarioServiceImpl;
import mx.com.cse.DataAccess.Config.DaoConfig;
import mx.com.cse.DataAccess.DAO.LoginDAO;
import mx.com.cse.DataAccess.DAO.MenuDAO;
import mx.com.cse.DataAccess.DAO.UsuarioDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 06/02/2013
 * Clase de configuracion de Beans 
 */
@Configuration
@Import(DaoConfig.class)
public class ConfiguracionCore {	
	@Autowired
	private UsuarioDAO usuarioDAO;
	@Autowired
	private LoginDAO loginDAO;
	@Autowired
	private MenuDAO menuDAO;

/**
 * Inyeccion del Servicio.
 * @return
 */
@Bean
public UsuarioService usuarioService(){
	UsuarioServiceImpl usuarioService=new UsuarioServiceImpl();
	usuarioService.setUsuarioDAO(usuarioDAO);
	usuarioService.setLoginDAO(loginDAO);
	usuarioService.setMenuDAO(menuDAO);
	return usuarioService;
}

}
