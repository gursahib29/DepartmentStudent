package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;


@Repository
public interface StudentRepository extends MongoRepository<Student,Integer>{}
