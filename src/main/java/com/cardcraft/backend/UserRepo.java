package com.cardcraft.backend;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<CardCraftUser, Long> {
    Optional<CardCraftUser> findById(Long id);

    CardCraftUser findByName(String name);
}