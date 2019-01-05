package com.guyboldon.sfgpetclinic.services;

import com.guyboldon.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findbyId(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
