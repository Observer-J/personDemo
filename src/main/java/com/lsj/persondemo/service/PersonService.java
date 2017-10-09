package com.lsj.persondemo.service;

import com.lsj.persondemo.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {

    List<Person> getPersonList();

    Person getPersonDetail(String personId);
}
