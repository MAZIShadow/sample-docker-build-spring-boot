package org.home.mazi.sampledockerbuildspringboot.repository;

import org.home.mazi.sampledockerbuildspringboot.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
}
