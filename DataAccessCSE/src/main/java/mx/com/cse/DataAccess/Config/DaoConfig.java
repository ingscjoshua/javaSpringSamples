package mx.com.cse.DataAccess.Config;

import mx.com.cse.DataAccess.DAO.LoginDAO;
import mx.com.cse.DataAccess.DAO.MenuDAO;
import mx.com.cse.DataAccess.DAO.UsuarioDAO;
import mx.com.cse.DataAccess.DAOImpl.LoginDAOimpl;
import mx.com.cse.DataAccess.DAOImpl.MenuDAOimpl;
import mx.com.cse.DataAccess.DAOImpl.UsuarioDAOimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 11/02/2013
 */
@Configuration
@EnableTransactionManagement
@Import(TransactionLocal.class)
public class DaoConfig {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Bean
	public PersistenceExceptionTranslationPostProcessor  persistenceExceptionTranslationPostProcessor (){
		return new PersistenceExceptionTranslationPostProcessor();
	}
	/**
	 * Creacion del dao para el usuario
	 * @return
	 */
	@Bean
	public UsuarioDAO usuarioDAO(){
		UsuarioDAOimpl usuarioDAO= new UsuarioDAOimpl();
		usuarioDAO.setSessionFactory(sessionFactory);
		return usuarioDAO;
	}
	/**
	 * Creacion del DAO para login
	 * @return
	 */
	@Bean
	public LoginDAO loginDAO(){
		LoginDAOimpl loginDAO= new LoginDAOimpl();
		loginDAO.setSessionFactory(sessionFactory);
		return loginDAO;
	}
	/**
	 * Creacion del DAO para la carga del ménu
	 */
	@Bean
	public MenuDAO menuDAO(){
		MenuDAOimpl menuDAO= new MenuDAOimpl();
		menuDAO.setSessionFactory(sessionFactory);
		return menuDAO;
	}
}
