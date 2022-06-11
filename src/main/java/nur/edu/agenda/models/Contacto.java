package nur.edu.agenda.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Contacto {

    @Id
    private int contacto_id;
    private String nombre;
    private String correoElectronico;

    @ManyToOne
    private Imagen imagen;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "contacto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Telefono> telefonos;

    public void addTelefono(Telefono nuevo){
        telefonos.add(nuevo);
    }
}
