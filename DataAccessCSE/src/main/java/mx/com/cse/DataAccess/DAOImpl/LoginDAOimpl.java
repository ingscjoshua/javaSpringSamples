package mx.com.cse.DataAccess.DAOImpl;

import mx.com.cse.DataAccess.DAO.LoginDAO;
import mx.com.cse.DataAccess.Model.LoginEntity;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 15/02/2013
 */
public class LoginDAOimpl extends HibernateDaoSupport implements LoginDAO {

	public LoginEntity getLogin(final String usuarioLogin) {
		LoginEntity loginEntity=null;
		loginEntity=(LoginEntity) getHibernateTemplate().execute(new HibernateCallback<Object>() {
			public Object doInHibernate(Session session)throws HibernateException{
				Query query=session.getNamedQuery("LoginEntity.getLogin");
				query.setString("usuarioLogin", usuarioLogin);
				return query.uniqueResult();
			}
		});
		return loginEntity;
	}

}
