package mx.com.cse.Core.Test;

import java.util.Date;
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
	@Test
	public void testConsultaUsuariosPorNombre(){
		UsuarioTO usuario= new UsuarioTO();
		usuario.setNomUsuario("josue");
		List<UsuarioTO>listaUsuarios=usuarioService.obtenerUsuarios(usuario);
		TestCase.assertTrue(!listaUsuarios.isEmpty());
		LOGGER.info(".::paso");
	}
	@Test
	public void testConsultaUsuarioPorApellido(){
		UsuarioTO usuario= new UsuarioTO();
		usuario.setApellidoPatero("hernandez");
		List<UsuarioTO>listaUsuarios=usuarioService.obtenerUsuarios(usuario);
		TestCase.assertTrue(!listaUsuarios.isEmpty());
		LOGGER.info(".::paso");
	}
	
	@Test
	public void testConsultaUsuarioPorFecha(){
		UsuarioTO usuario= new UsuarioTO();
		usuario.setFechaCreacion(new Date());
		List<UsuarioTO>listaUsuarios=usuarioService.obtenerUsuarios(usuario);
		TestCase.assertTrue(!listaUsuarios.isEmpty());
		LOGGER.info(".::paso");
		
	}
}
