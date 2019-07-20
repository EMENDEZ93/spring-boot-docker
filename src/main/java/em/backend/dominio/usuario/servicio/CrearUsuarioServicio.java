package em.backend.dominio.usuario.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import em.backend.dominio.usuario.modelo.Usuario;
import em.backend.dominio.usuario.repositorio.UsuarioRepositorio;

@Component
public class CrearUsuarioServicio {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	public Usuario ejecutar(Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
}
