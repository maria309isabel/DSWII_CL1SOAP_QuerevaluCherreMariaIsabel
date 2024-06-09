package pe.edu.cibertec.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.soap.model.medico;

@Repository
public interface medicoRepository extends JpaRepository<medico, Integer> {
}
