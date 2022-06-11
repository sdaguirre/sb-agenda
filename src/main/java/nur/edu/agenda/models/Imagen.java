package nur.edu.agenda.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;

@Entity
@Data
public class Imagen {
    @Id @GeneratedValue
    private int imagen_id;

    private String fileName;
    private String filePath;
    @Max(10)
    private String fileExtension;
    private boolean esTemporal;
}
