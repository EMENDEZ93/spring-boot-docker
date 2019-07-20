package em.backend.aplicacion.usuario.consulta.consulta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import em.backend.dominio.usuario.modelo.Usuario;
import em.backend.dominio.usuario.servicio.ListarUsuarioServicio;

@Component
public class ListarUsuarioManejador {

	@Autowired
	private ListarUsuarioServicio listarUsuarioServicio;
	
	public List<Usuario> ejecutar() {
		return listarUsuarioServicio.ejecutar();
	}
	
}
