package xyz.morawski.fishtankmanager.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.morawski.fishtankmanager.Models.LED;

@Repository
public interface LEDRepository extends JpaRepository<LED, Long> {
}
