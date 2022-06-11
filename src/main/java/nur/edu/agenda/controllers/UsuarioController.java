package nur.edu.agenda.controllers;

import nur.edu.agenda.models.Contacto;
import nur.edu.agenda.models.Usuario;
import nur.edu.agenda.repositories.UsuarioRepository;
import nur.edu.agenda.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping()
    public ResponseEntity<List<Usuario>> getAllUsuarios(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable Integer id){
        return ResponseEntity.ok(usuarioService.findById(id));

    }

    @PostMapping()
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.save(usuario));
    }
    @PostMapping("/{id}/contact")
    public ResponseEntity<Usuario> addContact(@PathVariable Integer id, @RequestBody Contacto contacto){
        return ResponseEntity.ok(usuarioService.addContact(id,contacto));
    }

}
