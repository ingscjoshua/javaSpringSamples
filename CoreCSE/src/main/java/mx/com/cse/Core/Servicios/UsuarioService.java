package mx.com.cse.Core.Servicios;

import java.util.List;

import mx.com.cse.TO.LoginTO;
import mx.com.cse.TO.UsuarioTO;

import org.primefaces.model.MenuModel;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 12/02/2013
 * 
 */

public interface UsuarioService{
	/**
	 * Metodo que carga el catalogo de usuarios.
	 * @return
	 */
	List<UsuarioTO>getAllUsuarios();
	/**
	 * Metodo que obtiene el usuario  si existe en el sistema y autentica al sistema.
	 * @param usuario
	 * @param password
	 * @return
	 */
	LoginTO getLogin(String usuario,String password);
	/**
	 * Método que obtiene el ménu en base al perfil del usuario.
	 * @param idPerfil
	 * @return
	 */
	MenuModel getMenuModel(final Long idPerfil);
	/**
	 * Método que obtiene los usuarios segun el filtro.
	 * @param usuario
	 * @return
	 */
	List<UsuarioTO> obtenerUsuarios(UsuarioTO usuario);
}
