package nur.edu.agenda.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Data
public class Telefono {
    @Id @GeneratedValue
    private int telefono_id;
    @Size(max = 50)
    private String tipo;
    @Size(max = 50)
    private String numeroTelefono;
    @ManyToOne
    @JoinColumn(name = "contacto_id", nullable = false)
    private Contacto contacto;

}
