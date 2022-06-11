package nur.edu.agenda.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
@Entity
@Data
public class Telefono {
    @Id @GeneratedValue
    private int telefono_id;
    @Max(50)
    private String tipo;
    @Max(50)
    private String numeroTelefono;
    @ManyToOne
    private Contacto contacto;

}
