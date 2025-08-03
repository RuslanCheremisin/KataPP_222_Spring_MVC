package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
@Service
public class CarService {
    private List<Car> cars = List.of(
            new Car("Mercedes-Benz", "S63", 2019),
            new Car("Genesis", "G80", 2018),
            new Car("Audi", "A8", 2019),
            new Car("Lexus", "LS600", 2017),
            new Car("Rolls-Royce", "Phantom", 2020));

    public List<Car> getCars() {
        return List.copyOf(cars);
    }

    public List<Car> getNumberOfCars(int number) {
        if (number <= cars.size() && number >= 0) {
            return List.copyOf(cars.subList(0, number));
        } else {
            return List.copyOf(cars.subList(number, cars.size()));
        }
    }
}
