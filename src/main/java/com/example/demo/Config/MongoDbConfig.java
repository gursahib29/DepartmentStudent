package com.example.demo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.Repository.StudentRepository;

@EnableMongoRepositories(basePackageClasses = StudentRepository.class)
@Configuration
public class MongoDbConfig {

}
