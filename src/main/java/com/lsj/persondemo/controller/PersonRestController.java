package com.lsj.persondemo.controller;

import com.lsj.persondemo.domain.Person;
import com.lsj.persondemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonRestController {

    private PersonService personService;

    @Autowired
    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/personList",method = RequestMethod.POST)
    public List<Person> personList(Person person){
        return personService.getPersonList();
    }

    @RequestMapping(value = "/personDetail",method = RequestMethod.POST)
    public Person personList(String personId){
        return personService.getPersonDetail(personId);
    }
}
