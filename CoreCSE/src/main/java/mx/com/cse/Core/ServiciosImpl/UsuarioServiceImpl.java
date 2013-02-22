package mx.com.cse.Core.ServiciosImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import mx.com.cse.Core.Servicios.UsuarioService;
import mx.com.cse.DataAccess.DAO.LoginDAO;
import mx.com.cse.DataAccess.DAO.UsuarioDAO;
import mx.com.cse.DataAccess.Model.LoginEntity;
import mx.com.cse.DataAccess.Model.UsuarioEntity;
import mx.com.cse.TO.LoginTO;
import mx.com.cse.TO.PerfilTO;
import mx.com.cse.TO.UsuarioTO;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 12/02/2013
 */
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioDAO usuarioDAO;
	@Autowired
	private LoginDAO loginDAO;

	public List<UsuarioTO> getAllUsuarios() {
		List<UsuarioTO>listaUsuarios= new ArrayList<UsuarioTO>();
		List<UsuarioEntity>listTempUsuarios= new ArrayList<UsuarioEntity>();
		listTempUsuarios=usuarioDAO.getAllUsuarios();
		for (UsuarioEntity usuarioEntity : listTempUsuarios) {
			UsuarioTO usuarioTO= new UsuarioTO();
			BeanUtils.copyProperties(usuarioEntity, usuarioTO);
			listaUsuarios.add(usuarioTO);
		}
		return listaUsuarios;
	}
	public LoginTO getLogin(String usuario, String password) {
		LoginTO loginTO=null;
		LoginEntity loginEntity= loginDAO.getLogin(usuario);
		if(loginEntity!=null){
			loginTO= new LoginTO();
			BeanUtils.copyProperties(loginEntity, loginTO);
			UsuarioTO usuarioTO= new UsuarioTO();
			BeanUtils.copyProperties(loginEntity.getUsuario(),usuarioTO);
			loginTO.setUsuarioTO(usuarioTO);
			PerfilTO perfilTO= new PerfilTO();
			BeanUtils.copyProperties(loginEntity.getPerfil(), perfilTO);
			loginTO.setPerfilTO(perfilTO);
		}
		return loginTO;
	}
	
	/**
	 * @param usuarioDAO the usuarioDAO to set
	 */
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	/**
	 * @param loginDAO the loginDAO to set
	 */
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}


	
}
