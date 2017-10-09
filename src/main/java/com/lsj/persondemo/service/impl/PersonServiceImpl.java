package com.lsj.persondemo.service.impl;

import com.lsj.persondemo.domain.Person;
import com.lsj.persondemo.repository.PersonRepository;
import com.lsj.persondemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getPersonList() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonDetail(String personId) {
        return personRepository.getOne(personId);
    }
}
