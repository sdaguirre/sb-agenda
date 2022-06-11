package nur.edu.agenda.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data

public class Usuario {
    @Id
    @GeneratedValue
    private int usuario_id;
    private String nombreCompleto;
    @Size(max = 50)
    private String usuario;
    @Size(max = 500)
    @JsonIgnore
    private String password;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Contacto> contactos;

    public void addContacto(Contacto nuevo) {
        if (contactos == null) {
            contactos = new HashSet<>();
        }
        contactos.add(nuevo);
        nuevo.setUsuario(this);
    }

    public void removeContacto(Contacto contacto) {
        contacto.setUsuario(null);
        contactos.remove(contacto);
    }

}
