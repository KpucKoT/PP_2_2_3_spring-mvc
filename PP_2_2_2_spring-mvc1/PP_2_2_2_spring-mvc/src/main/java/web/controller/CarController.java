package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;



@Controller
@RequestMapping
public class CarController {


    private final CarService carServiceImpl;

    @Autowired
    public CarController(CarService carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }


    @GetMapping("/cars")
        public String cars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
            model.addAttribute("cars", carServiceImpl.carList(count));
            return "cars";

        }
}
