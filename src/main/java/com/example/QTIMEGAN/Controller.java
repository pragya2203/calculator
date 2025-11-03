package com.example.QTIMEGAN;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {



    @GetMapping("test")
    public int testing(){
        return 5;
    }

    @Autowired
    public ControllerService controllerService;

    @PostMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return controllerService.add(a,b);
    }

    @PostMapping("/sub")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return controllerService.subtract(a,b);
    }

    @PostMapping("/mul")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return controllerService.mul(a,b);
    }

    @PostMapping("/div")
    public double div(@RequestParam double a, @RequestParam double b) {
        return controllerService.div(a,b);
    }
}
