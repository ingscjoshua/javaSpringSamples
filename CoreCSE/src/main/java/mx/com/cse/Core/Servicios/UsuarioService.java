package mx.com.cse.Core.Servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.com.cse.TO.LoginTO;
import mx.com.cse.TO.UsuarioTO;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 12/02/2013
 * 
 */
@Service
public interface UsuarioService {
	/**
	 * Metodo que carga el catalogo de usuarios.
	 * @return
	 */
	List<UsuarioTO>getAllUsuarios();
	LoginTO getLogin(String usuario,String password);
}
