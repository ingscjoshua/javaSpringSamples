package mx.com.cse.DataAccess.DAO;

import java.util.List;

import mx.com.cse.DataAccess.Model.UsuarioEntity;


/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 12/02/2013
 * Calse DAO Base con los metodo genericos para implementar
 */

public interface UsuarioDAO {
	/**
	 * Retrona todo los usuarios
	 * @return
	 */
	List<UsuarioEntity>getAllUsuarios();
	/**
	 * Busca un usuario 
	 * @return
	 */
	UsuarioEntity buscaUsuario(String nomUsuario);

}
