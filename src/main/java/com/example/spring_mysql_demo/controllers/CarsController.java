package com.example.spring_mysql_demo.controllers;

import com.example.spring_mysql_demo.models.Car;
import com.example.spring_mysql_demo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/cars")
public class CarsController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping("/{id}")
    public Car read(@PathVariable int id) {

        var optionalCar = carRepository.findById(id);
        return (Car) optionalCar.orElse(null);
    }

    @PostMapping("/")
    public Car create(@RequestBody Car cars){
        carRepository.save(cars);
        return cars;
    }
}
