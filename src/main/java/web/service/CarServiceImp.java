package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Mitsubishi", 3, 9000));
        carList.add(new Car("УАЗ", 5, 4000));
        carList.add(new Car("Renoult", 2, 2000));
        carList.add(new Car("Лада", 1, 8000));
        carList.add(new Car("Suzuki", 7, 12000));
    }

    @Override
    public List<Car> carList(int countCar) {
        List<Car> subList = new ArrayList<>();
        for (int i = 0; i < countCar; i++) {
            if (i <= 4) {
                subList.add(carList.get(i));
            } else break;
        }
        return subList;
    }
}
