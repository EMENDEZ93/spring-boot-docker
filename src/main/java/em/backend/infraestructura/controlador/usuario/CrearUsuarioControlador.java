package em.backend.infraestructura.controlador.usuario;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import em.backend.aplicacion.usuario.comando.comando.UsuarioComando;
import em.backend.aplicacion.usuario.comando.manejador.CrearUsuarioManejador;
import em.backend.dominio.usuario.modelo.Usuario;

@RestController
public class CrearUsuarioControlador {

	@Autowired
	private CrearUsuarioManejador crearUsuarioManejador;

	@PostMapping("/usuario")
	public Usuario crear(@Valid @RequestBody UsuarioComando comando) {
		return crearUsuarioManejador.ejecutar(comando);
	}
	
}
