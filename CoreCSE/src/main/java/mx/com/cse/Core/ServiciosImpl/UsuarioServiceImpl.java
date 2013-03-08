package mx.com.cse.Core.ServiciosImpl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import javax.el.MethodExpression;

import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;
import org.primefaces.model.DefaultMenuModel;
import org.primefaces.model.MenuModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import mx.com.cse.Core.Servicios.UsuarioService;
import mx.com.cse.DataAccess.DAO.LoginDAO;
import mx.com.cse.DataAccess.DAO.MenuDAO;
import mx.com.cse.DataAccess.DAO.UsuarioDAO;
import mx.com.cse.DataAccess.Model.LoginEntity;
import mx.com.cse.DataAccess.Model.MenuEntity;
import mx.com.cse.DataAccess.Model.UsuarioEntity;
import mx.com.cse.TO.LoginTO;
import mx.com.cse.TO.PerfilTO;
import mx.com.cse.TO.UsuarioTO;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com 12/02/2013
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {
	private UsuarioDAO usuarioDAO;
	private LoginDAO loginDAO;
	private MenuDAO menuDAO;

	public List<UsuarioTO> getAllUsuarios() {
		List<UsuarioTO> listaUsuarios = new ArrayList<UsuarioTO>();
		List<UsuarioEntity> listTempUsuarios = new ArrayList<UsuarioEntity>();
		listTempUsuarios = usuarioDAO.getAllUsuarios();
		for (UsuarioEntity usuarioEntity : listTempUsuarios) {
			UsuarioTO usuarioTO = new UsuarioTO();
			BeanUtils.copyProperties(usuarioEntity, usuarioTO);
			listaUsuarios.add(usuarioTO);
		}
		return listaUsuarios;
	}

	public LoginTO getLogin(String usuario, String password) {
		LoginTO loginTO = null;
		LoginEntity loginEntity = loginDAO.getLogin(usuario);
		if (loginEntity != null) {
			loginTO = new LoginTO();
			BeanUtils.copyProperties(loginEntity, loginTO);
			UsuarioTO usuarioTO = new UsuarioTO();
			BeanUtils.copyProperties(loginEntity.getUsuario(), usuarioTO);
			loginTO.setUsuarioTO(usuarioTO);
			PerfilTO perfilTO = new PerfilTO();
			BeanUtils.copyProperties(loginEntity.getPerfil(), perfilTO);
			loginTO.setPerfilTO(perfilTO);
		}
		return loginTO;
	}

	public MenuModel getMenuModel(Long idPerfil) {
		MenuModel menu = new DefaultMenuModel();
		List<MenuEntity> listaMenus = menuDAO.listaMenus(idPerfil);
		if (!listaMenus.isEmpty()) {
			for (MenuEntity menuEntity : listaMenus) {
				Submenu submenu = new Submenu();
				submenu.setLabel(menuEntity.getNombreMenu());
				MenuItem menuItem = new MenuItem();
				menuItem.setValue(menuEntity.getNombreMenu());
				menuItem.setTitle(menuEntity.getNombreMenu());
				Application app = FacesContext.getCurrentInstance()
						.getApplication();
				MethodExpression methodExpression = app.getExpressionFactory()
						.createMethodExpression(
								FacesContext.getCurrentInstance()
										.getELContext(),
								menuEntity.getAccionMenu(), null,
								new Class[] {});
				menuItem.setActionExpression(methodExpression);
				submenu.getChildren().add(menuItem);
				menu.addSubmenu(submenu);
			}

		}
		return menu;
	}

	/**
	 * @param usuarioDAO
	 *            the usuarioDAO to set
	 */
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	/**
	 * @param loginDAO
	 *            the loginDAO to set
	 */
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	/**
	 * @param menuDAO
	 *            the menuDAO to set
	 */
	public void setMenuDAO(MenuDAO menuDAO) {
		this.menuDAO = menuDAO;
	}

}
