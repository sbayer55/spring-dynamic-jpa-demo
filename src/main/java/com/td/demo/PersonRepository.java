package com.td.demo;

import com.joutvhu.dynamic.jpa.DynamicQuery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, String> {
    @DynamicQuery("select p from Person p where 1 = 1 <#if name?has_content>and p.name = :name</#if> <#if age?has_content>and p.age = :age</#if>")
    List<Person> findByNameOrAge(String name, Integer age);
}
