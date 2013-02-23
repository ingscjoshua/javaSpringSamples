package mx.com.cse.DataAccess.DAO;

import java.util.List;

import mx.com.cse.DataAccess.Model.MenuEntity;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 22/02/2013
 * claes que se mapea con la table MENU  y ejecuta sus operaciones correspondientes.
 */
public interface MenuDAO {
	List<MenuEntity>listaMenus(Long idPerfil);

}
