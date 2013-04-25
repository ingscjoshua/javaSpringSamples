package mx.com.cse.DataAccess.DAOImpl;

import java.io.Serializable;
import java.util.List;

import mx.com.cse.DataAccess.DAO.UsuarioDAO;
import mx.com.cse.DataAccess.Model.UsuarioEntity;
import mx.com.cse.TO.UsuarioTO;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 12/02/2013
 */
public class UsuarioDAOimpl extends HibernateDaoSupport implements UsuarioDAO, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public List<UsuarioEntity> getAllUsuarios() {
		List<UsuarioEntity>ListaUsuarios=getHibernateTemplate().findByNamedQuery("UsuarioEntity.getAllUsuarios");
		return ListaUsuarios;
	}
	@SuppressWarnings("unchecked")
	public List<UsuarioEntity> usuariosByFilter( UsuarioTO usuario) {
		Criteria criteria=getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(UsuarioEntity.class);
		if(usuario.getNomUsuario()!=null &&!usuario.getNomUsuario().equals("")){
			criteria.add(Restrictions.like("nomUsuario",usuario.getNomUsuario()+"%"));
		}
		if(usuario.getApellidoPatero()!=null&& !usuario.getApellidoPatero().equals("")){
			criteria.add(Restrictions.ilike("apellidoPatero", usuario.getApellidoPatero()+"%"));
		}
		if(usuario.getFechaCreacion()!=null){
			criteria.add(Restrictions.le("fechaCreacion",usuario.getFechaCreacion()));
		}
		return criteria.list();
	}
}
