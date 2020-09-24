package com.td.demo;

import com.joutvhu.dynamic.jpa.DynamicQuery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, String> {
    @DynamicQuery("select p from person p where p.name = :name")
    List<Person> findByName(String name);
}
