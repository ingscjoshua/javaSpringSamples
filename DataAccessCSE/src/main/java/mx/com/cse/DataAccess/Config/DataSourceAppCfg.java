package mx.com.cse.DataAccess.Config;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 07/03/2013
 */
@Configuration
@Import(PropiedadesCFG.class)
public class DataSourceAppCfg {
	@Value("${cse.jndi.datasource}")
	private String jndiDatasource;
	/**
	 * Bean para el datasource referenciado
	 * mediante el JDNI en el contexto que se este
	 * ejecutando
	 * 
	 * @return	dataSource
	 * @throws Exception
	 */
	@Bean
	public DataSource dataSource() throws Exception {
		Context ctx = new InitialContext();
		return (DataSource) ctx.lookup(jndiDatasource);
	}
	
}
