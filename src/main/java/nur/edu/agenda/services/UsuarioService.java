package nur.edu.agenda.services;

import nur.edu.agenda.models.Usuario;
import nur.edu.agenda.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario findById(Integer id){
        return usuarioRepository.findById(id).orElseThrow();
    }
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
