package com.example.spring_mysql_demo.repositories;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository<Car> extends CrudRepository<Car, Integer> {

}
