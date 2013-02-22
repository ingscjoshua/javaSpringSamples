package mx.com.cse.DataAccess.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 11/02/2013
 * clase que configura el acceso al propiertes 
 */
@Configuration
@PropertySource("classpath:LocalDataSourceCSE.properties")
public class PropiedadesCFG {
	
	@Bean
	public static  PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}

}
