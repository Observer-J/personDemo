package com.lsj.persondemo.repository;

import com.lsj.persondemo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,String>{
}
