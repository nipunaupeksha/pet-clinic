package com.flt.petclinic.bootstrap;

import com.flt.petclinic.model.Owner;
import com.flt.petclinic.model.Vet;
import com.flt.petclinic.services.OwnerService;
import com.flt.petclinic.services.VetService;
import com.flt.petclinic.services.map.OwnerServiceMap;
import com.flt.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {

        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Harry");
        owner1.setLastName("Potter");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ron");
        owner2.setLastName("Weasley");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Hermione");
        vet1.setLastName("Granger");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Fred");
        vet2.setLastName("Weasley");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}