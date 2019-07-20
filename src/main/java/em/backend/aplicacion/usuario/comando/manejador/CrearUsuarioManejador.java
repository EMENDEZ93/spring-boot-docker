package em.backend.aplicacion.usuario.comando.manejador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import em.backend.aplicacion.usuario.comando.comando.UsuarioComando;
import em.backend.aplicacion.usuario.comando.fabrica.UsuarioFabrica;
import em.backend.dominio.usuario.modelo.Usuario;
import em.backend.dominio.usuario.servicio.CrearUsuarioServicio;

@Component
public class CrearUsuarioManejador {

	@Autowired
	private UsuarioFabrica usuarioFabrica;
	
	@Autowired
	private CrearUsuarioServicio crearUsuarioServicio;

	public Usuario ejecutar(UsuarioComando comando) {
		Usuario usuario = usuarioFabrica.crear(comando);
		return crearUsuarioServicio.ejecutar(usuario);
	}
	
}
