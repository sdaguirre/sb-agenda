package nur.edu.agenda.repositories;

import nur.edu.agenda.models.Contacto;
import nur.edu.agenda.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto,Integer> {

}
