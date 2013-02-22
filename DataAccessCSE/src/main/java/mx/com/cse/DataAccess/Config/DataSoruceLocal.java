package mx.com.cse.DataAccess.Config;


import java.sql.Driver;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;



/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 11/02/2013
 * Clase que configurar el dataSourceLocal
 */
@Configuration
@Import(PropiedadesCFG.class)
public class DataSoruceLocal {
	private @Value("${cse.mysql.url}")String url;
	private @Value("${cse.mysql.userDb}")String dbUser;
	private @Value("${cse.mysql.pwdDb}")String pwdDb;
	
	/**
	 * Bean que carga la configuracion local del datasource para mysql
	 * @return
	 * @throws SQLException 
	 */
	@Bean
	public DataSource dataSource() throws SQLException{
		 Driver mySqlDriver= new com.mysql.jdbc.Driver();
		return new SimpleDriverDataSource(mySqlDriver,url,dbUser,pwdDb);
	}

}
