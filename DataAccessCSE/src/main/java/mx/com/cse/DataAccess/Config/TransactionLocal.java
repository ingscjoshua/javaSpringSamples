package mx.com.cse.DataAccess.Config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.transaction.support.ResourceTransactionManager;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 11/02/2013
 */
@Configuration
@Import(DataAccessCfg.class)
public class TransactionLocal {
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * Bean del transacction Manager
	 * @return
	 */
	@Bean
	public ResourceTransactionManager transactionManager(){
		return new HibernateTransactionManager(sessionFactory);
	}
}
