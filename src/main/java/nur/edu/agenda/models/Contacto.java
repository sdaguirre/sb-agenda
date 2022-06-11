package nur.edu.agenda.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Contacto {

    @Id
    private int contacto_id;
    private String nombre;
    private String correoElectronico;

    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "imagen_id")
    private Imagen imagen;

    @JsonIgnore
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "contacto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Telefono> telefonos;

    public void addTelefono(Telefono nuevo){
        telefonos.add(nuevo);
    }
}
