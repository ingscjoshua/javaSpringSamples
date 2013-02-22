package mx.com.cse.Core.Test;


import mx.com.cse.Core.Config.ConfiguracionCore;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 15/02/2013
 * Clase base Utilitaria para las pruebas unitarias
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConfiguracionCore.class})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public abstract class BaseTest {
	protected Logger LOGGER;

	/**
	 * 
	 */
	@Autowired
	private ApplicationContext applicationContext;

	
	/**
	 * @param clase
	 */
	public BaseTest(Class<?> clase) {
		LOGGER = LoggerFactory.getLogger(clase);
	}

}
