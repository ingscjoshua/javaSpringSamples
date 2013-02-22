package mx.com.cse.DataAccess.DAOImpl;

import java.util.List;

import mx.com.cse.DataAccess.DAO.UsuarioDAO;
import mx.com.cse.DataAccess.Model.UsuarioEntity;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 12/02/2013
 */
public class UsuarioDAOimpl extends HibernateDaoSupport implements UsuarioDAO{

	@SuppressWarnings("unchecked")
	public List<UsuarioEntity> getAllUsuarios() {
		List<UsuarioEntity>ListaUsuarios=getHibernateTemplate().findByNamedQuery("UsuarioEntity.getAllUsuarios");
		return ListaUsuarios                   ;
	}

	public UsuarioEntity buscaUsuario(String nomUsuario) {
		
		return null;
	}

}
