package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {

    private final CarServiceImp carService;

    public CarController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(defaultValue = "5") Integer count, Model model) {

        model.addAttribute("car", carService.carList(count));
        return "cars";

    }
}
