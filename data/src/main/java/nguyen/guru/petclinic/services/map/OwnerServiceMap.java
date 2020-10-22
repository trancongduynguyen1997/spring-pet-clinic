package nguyen.guru.petclinic.services.map;

import nguyen.guru.petclinic.models.Owner;
import nguyen.guru.petclinic.models.Pet;
import nguyen.guru.petclinic.services.OwnerService;
import nguyen.guru.petclinic.services.PetService;
import nguyen.guru.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner entity) {
        super.delete(entity);
    }

    @Override
    public Owner save(Owner entity) {
        if(entity != null) {
            entity.getPets().forEach(pet -> {
                if(pet.getPetType() != null) {
                    if(pet.getPetType().getId() == null) {
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                }
                else {
                    throw new RuntimeException("Pet type is required");
                }

                if(pet.getId() == null) {
                    Pet savedPet = petService.save(pet);
                    pet.setId(savedPet.getId());
                }

            });

            return super.save(entity);
        }
        return null;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
