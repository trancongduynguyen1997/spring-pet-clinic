package nguyen.guru.petclinic.services.map;

import nguyen.guru.petclinic.models.Speciality;
import nguyen.guru.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality entity) {
        super.delete(entity);
    }

    @Override
    public Speciality save(Speciality entity) {
        return super.save(entity);
    }
}
