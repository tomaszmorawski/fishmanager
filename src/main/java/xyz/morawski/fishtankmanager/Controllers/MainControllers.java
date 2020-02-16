package xyz.morawski.fishtankmanager.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xyz.morawski.fishtankmanager.Models.LED;
import xyz.morawski.fishtankmanager.Services.LEDService;

import java.util.List;

@RestController
public class MainControllers {
    private LEDService ledService;

    public MainControllers(LEDService ledService) {
        this.ledService = ledService;
    }

    @GetMapping("/")
    public List<LED> index(Model model) {
        return ledService.getAllLEDs();
    }

    @PostMapping("/LED")
    public LED addLED(Model model, @RequestBody LED led) {
        return ledService.addLED(led);
    }

    @GetMapping("/LED/{id}")
    public LED findLED(@PathVariable Long id, Model model) {
        return ledService.find(id).orElse(new LED());
    }
}
