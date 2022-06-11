package nur.edu.agenda.repositories;

import nur.edu.agenda.models.Imagen;
import nur.edu.agenda.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenRepository extends JpaRepository<Imagen,Integer> {

}
