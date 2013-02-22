package mx.com.cse.Core.Test;

import java.util.List;

import junit.framework.TestCase;
import mx.com.cse.Core.ServiciosImpl.UsuarioServiceImpl;
import mx.com.cse.TO.LoginTO;
import mx.com.cse.TO.UsuarioTO;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Josué Hernández Ramírez
 * @Company Consultores de Software Evolutivo
 * @Email ventas@csofte.com
 * 06/02/2013
 */
public class UsuarioTest extends BaseTest{
	@Autowired
	private UsuarioServiceImpl usuarioService;
	public UsuarioTest() {
		super(UsuarioTest.class);
	}
	
	@Test
	public void testUsuarios(){
		List<UsuarioTO>listaUsuarios=usuarioService.getAllUsuarios(); 
		TestCase.assertTrue(!listaUsuarios.isEmpty());
		LOGGER.info("User: "+listaUsuarios.size());
		
	}
	@Test
	public void testLogin(){
		LoginTO loginTO = new LoginTO();
		loginTO=usuarioService.getLogin("ingscjoshua", "123");
		TestCase.assertEquals("xl8", loginTO.getPasswordLogin());
	}
}
