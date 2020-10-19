package nguyen.guru.petclinic.bootstrap;

import nguyen.guru.petclinic.models.Owner;
import nguyen.guru.petclinic.models.Vet;
import nguyen.guru.petclinic.services.OwnerService;
import nguyen.guru.petclinic.services.VetService;
import nguyen.guru.petclinic.services.map.OwnerServiceMap;
import nguyen.guru.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("T");
        owner1.setLastName("N");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("TT");
        owner2.setLastName("NN");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("C");
        vet1.setLastName("D");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("CC");
        vet2.setLastName("DD");
        vetService.save(vet2);
    }
}
