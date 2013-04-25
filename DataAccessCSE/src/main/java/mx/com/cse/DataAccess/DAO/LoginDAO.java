package mx.com.cse.DataAccess.DAO;


import mx.com.cse.DataAccess.Model.LoginEntity;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 15/02/2013
 * Clase que accede al login de usuarios.
 */
public interface LoginDAO {
	/**
	 * Metodo que obtiene el Login de un usuario
	 * @param usuarioLogin
	 * @return
	 */
	public LoginEntity getLogin(String usuarioLogin);

}
