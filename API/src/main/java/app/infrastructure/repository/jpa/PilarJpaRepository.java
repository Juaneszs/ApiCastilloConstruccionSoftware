package app.infrastructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import app.infrastructure.entity.PilarEntity;

public interface PilarJpaRepository extends JpaRepository<PilarEntity, Long> {

}
