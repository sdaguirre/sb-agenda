package nur.edu.agenda.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Data
public class Imagen {
    @Id @GeneratedValue
    private int imagen_id;

    private String fileName;
    @Size(max = 1000)
    private String filePath;
    @Size(max=10)
    private String fileExtension;
    private boolean esTemporal;
}
