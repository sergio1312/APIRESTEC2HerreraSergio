package pe.edu.cibertec.WAEC2HerreraSergio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.WAEC2HerreraSergio.model.bd.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {
}
