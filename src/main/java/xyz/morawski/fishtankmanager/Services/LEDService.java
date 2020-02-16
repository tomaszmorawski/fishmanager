package xyz.morawski.fishtankmanager.Services;

import org.springframework.stereotype.Service;
import xyz.morawski.fishtankmanager.Models.LED;
import xyz.morawski.fishtankmanager.Repositories.LEDRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LEDService {
    private LEDRepository ledRepository;

    public LEDService(LEDRepository ledRepository) {
        this.ledRepository = ledRepository;
    }

    public List<LED> getAllLEDs() {
        return ledRepository.findAll();
    }

    public LED addLED(LED led) {
        return ledRepository.save(led);
    }

    public Optional<LED> find(Long id) {
        return ledRepository.findById(id);
    }
}
