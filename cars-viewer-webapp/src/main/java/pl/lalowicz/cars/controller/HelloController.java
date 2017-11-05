package pl.lalowicz.cars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.lalowicz.cars.vehicle.VehicleService;

/**
 * Created by radoslaw.lalowicz on 2017-11-04.
 */
@Controller
public class HelloController {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping("/")
    String home(ModelMap modal) {
        modal.addAttribute("title", "Dear Learner");
        modal.addAttribute("message", "Welcome to SpringBoot");
        modal.addAttribute("carInfo", vehicleService.get(1L).toString());
        return "hello";
    }

}
