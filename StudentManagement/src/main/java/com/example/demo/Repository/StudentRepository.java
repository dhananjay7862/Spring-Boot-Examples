package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.student;

@Repository
public interface StudentRepository extends CrudRepository<student, Integer> {

}
