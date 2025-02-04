package com.trimble.Trimble.Cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	 @Autowired
	    private CarRepository carRepository;

	    public List<Cars> getAllCars() {
	        return carRepository.findAll();
	    }

	    public Cars registerCar(Cars car) {
	        return carRepository.save(car);
	    }

	    public List<Cars> getCarsByStatus(String status) {
	        return carRepository.findByStatus(status);
	    }

}
