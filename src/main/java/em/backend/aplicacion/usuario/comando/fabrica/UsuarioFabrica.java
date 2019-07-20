package em.backend.aplicacion.usuario.comando.fabrica;

import org.springframework.stereotype.Component;

import em.backend.aplicacion.usuario.comando.comando.UsuarioComando;
import em.backend.dominio.usuario.modelo.Usuario;

@Component
public class UsuarioFabrica {

	public Usuario crear(UsuarioComando comando) {
		Usuario usuario = new Usuario();
		usuario.setNombre(comando.getNombre());
		return usuario;
	}

}
