package petclinicproject.springdemo.services;

import petclinicproject.springdemo.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
