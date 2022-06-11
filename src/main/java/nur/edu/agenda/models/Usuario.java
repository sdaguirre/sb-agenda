package nur.edu.agenda.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Usuario {
    @Id @GeneratedValue
    private int usuario_id;
    private String nombreCompleto;
    private String usuario;
    @JsonIgnore
    private String password;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Contacto> contactos;

    public void addContacto(Contacto nuevo) {
        if (contactos == null) {
            contactos = new HashSet<>();
        }
        nuevo.setUsuario(this);
        contactos.add(nuevo);
    }

    public void removeContacto(Contacto contacto){
        contacto.setUsuario(null);
        contactos.remove(contacto);
    }

}
