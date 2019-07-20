package em.backend.infraestructura.controlador.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import em.backend.aplicacion.usuario.consulta.consulta.ListarUsuarioManejador;
import em.backend.dominio.usuario.modelo.Usuario;

@RestController
public class ListarUsuarioControlador {

	@Autowired
	private ListarUsuarioManejador listarUsuarioManejador;

	@GetMapping
	public List<Usuario> listar() {
		return listarUsuarioManejador.ejecutar();
	}
	
}
