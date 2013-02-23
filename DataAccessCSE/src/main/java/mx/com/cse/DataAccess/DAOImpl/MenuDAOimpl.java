package mx.com.cse.DataAccess.DAOImpl;

import java.util.List;

import mx.com.cse.DataAccess.DAO.MenuDAO;
import mx.com.cse.DataAccess.Model.MenuEntity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 22/02/2013
 * 
 */
public class MenuDAOimpl extends HibernateDaoSupport implements MenuDAO{
	/**
	 * Método que obtiene el resultado de los menus segun el perfil.
	 */
	@SuppressWarnings("unchecked")
	public List<MenuEntity> listaMenus(final Long idPerfil) {
		List<MenuEntity>listaMenus=(List<MenuEntity>)this.getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(final Session session) {
			Query query=session.getNamedQuery("MenuEntity.getMEnusByPerfil");
			query.setLong("idPerfil", idPerfil);
			return query.list();	
			}
		});
		return listaMenus;
	}
}
