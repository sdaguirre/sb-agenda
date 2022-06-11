package nur.edu.agenda.controllers;

import nur.edu.agenda.models.Usuario;
import nur.edu.agenda.repositories.UsuarioRepository;
import nur.edu.agenda.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario/")
    public ResponseEntity<List<Usuario>> getAllUsuarios(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable Integer id){
        return ResponseEntity.ok(usuarioService.findById(id));

    }

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.save(usuario));
    }

}
