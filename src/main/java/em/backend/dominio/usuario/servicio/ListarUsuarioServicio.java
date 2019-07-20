package em.backend.dominio.usuario.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import em.backend.dominio.usuario.modelo.Usuario;
import em.backend.dominio.usuario.repositorio.UsuarioRepositorio;

@Component
public class ListarUsuarioServicio {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	public List<Usuario> ejecutar() {
		return usuarioRepositorio.findAll();
	}
	
}
