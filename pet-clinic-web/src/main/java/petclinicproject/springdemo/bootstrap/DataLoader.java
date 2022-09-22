package petclinicproject.springdemo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import petclinicproject.springdemo.model.Owner;
import petclinicproject.springdemo.model.Vet;
import petclinicproject.springdemo.services.OwnerService;
import petclinicproject.springdemo.services.VetService;
import petclinicproject.springdemo.services.map.OwnerServiceMap;
import petclinicproject.springdemo.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(){
      ownerService = new OwnerServiceMap();
      vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("ibrahim");
        owner1.setLastName("zeroual");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("3abslam");
        owner2.setLastName("zozo");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        Vet vet2 = new Vet();

        vet1.setFirstName("tbib1");
        vet1.setId(1L);
        vet2.setFirstName("tbib2");
        vet2.setId(2L);

        vetService.save(vet1);
        vetService.save(vet2);
    }
}
