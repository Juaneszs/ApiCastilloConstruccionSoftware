package app.infrastructure.repository.jpa;

import app.domain.model.Pilar;
import app.domain.repository.PilarRepository;
import app.infrastructure.entity.PilarEntity;
import org.springframework.stereotype.Component;
import java.util.Optional;
import java.util.List;


@Component
public class PilarRepositoryAdapter implements PilarRepository {

    private final PilarJpaRepository jpa;

    public PilarRepositoryAdapter(PilarJpaRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public Optional<Pilar> findByid(Long id) {
        return jpa.findById(id).map(this::toDomain);
    }
	
    @Override
	public Pilar Save(Pilar p) {
		PilarEntity entity = toEntity(p);
		return toDomain(jpa.save(entity));
	}
	
	private Pilar toDomain(PilarEntity e) {
		Pilar p = new Pilar();
		p.setid(e.getid());
		p.setname(e.getname());
		p.setposy(e.getposy());
		p.setposx(e.getposx());
		p.setstatus(e.getstatus());
		return p;
		
	}
	private PilarEntity toEntity(Pilar p) {
		PilarEntity e = new PilarEntity();
		e.setid(p.getid());
		e.setname(p.getname());
		e.setposx(p.getposx());
		e.setposy(p.getposy());
		e.setstatus(p.getstatus());
		return e;
		
	}
	
	@Override
	public List<Pilar> findAll(){
		return jpa.findAll().stream()
				.map(this::toDomain)
				.toList();
	}
}
