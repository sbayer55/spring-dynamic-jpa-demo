package com.td.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping
    public List<Person> get() {
        return personRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<Person> getByName(@PathVariable String name) {
        return personRepository.findByName(name);
    }

    @PostMapping
    public void post(@RequestBody Person person) {
        personRepository.save(person);
    }
}
