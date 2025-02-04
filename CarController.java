package com.trimble.Trimble.Cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
public class CarController {
	 @Autowired
	    private CarService carService;

	    @GetMapping
	    public List<Cars> getAllCars() {
	        return carService.getAllCars();
	    }

	    @PostMapping
	    public Cars registerCar(@RequestBody Cars car) {
	        return carService.registerCar(car);
	    }

	    @GetMapping("/status/{status}")
	    public List<Cars> getCarsByStatus(@PathVariable String status) {
	        return carService.getCarsByStatus(status);
	    }


}
