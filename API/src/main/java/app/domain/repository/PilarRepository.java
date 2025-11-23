package app.domain.repository;
import app.domain.model.Pilar;
import java.util.Optional;
import java.util.List;

public interface PilarRepository {
	Optional<Pilar> findByid(Long id);
	Pilar Save(Pilar Pilar);
	
	List<Pilar> findAll();

}
