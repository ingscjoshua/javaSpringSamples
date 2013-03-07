package mx.com.cse.DataAccess.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 06/02/2013
 */
@Configuration
@Import({DataSourceAppCfg.class,DataSoruceLocal.class})
public class DataAccessCfg{
	@Autowired
	private DataSource dataSource;
	/**
	 * Session Factory 
	 * @return
	 * Bean que inyecta la configuracion de Hibernate
	 */
	@Bean
	public AnnotationSessionFactoryBean sessionFactoryBean(){
		Properties hibernateProperties= new Properties();
		AnnotationSessionFactoryBean sessionFactoryBean= new AnnotationSessionFactoryBean();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		hibernateProperties.setProperty("hibernate.show.sql", "false");
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setHibernateProperties(hibernateProperties);
		sessionFactoryBean.setPackagesToScan(new String[]{"mx.com.cse.DataAccess.Model"});
		return sessionFactoryBean;
	}
	/**
	 * SessionFactory 
	 * @return
	 */
	@Bean
	public SessionFactory sessionFactory(){
		return(SessionFactory)sessionFactoryBean().getObject();
	}
}
