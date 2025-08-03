package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarServiceImpl carServiceImpl;

    @GetMapping(value = "/")
    public String getAllCars(ModelMap model) {

        List<Car> cars = carServiceImpl.getCars();
        model.addAttribute("cars", cars);
        return "cars";
    }

    @GetMapping(value = "/counting")
    public String getNumberOfCars(@RequestParam int number, ModelMap model) {

        List<Car> cars = carServiceImpl.getNumberOfCars(number);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
