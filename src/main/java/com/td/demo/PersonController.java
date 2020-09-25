package com.td.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping
    public List<Person> get(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) {
        return personRepository.findByNameOrAge(name, age);
    }

    @GetMapping("/{name}")
    public List<Person> getByName(@PathVariable String name) {
        return personRepository.findByNameOrAge(name, null);
    }

    @PostMapping
    public void post(@RequestBody Person person) {
        personRepository.save(person);
    }
}
