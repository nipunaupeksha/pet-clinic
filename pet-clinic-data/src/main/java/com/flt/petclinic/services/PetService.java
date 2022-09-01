package com.flt.petclinic.services;

import com.flt.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
