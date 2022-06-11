package nur.edu.agenda.repositories;

import nur.edu.agenda.models.Telefono;
import nur.edu.agenda.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefonoRepository extends JpaRepository<Telefono,Integer> {

}
