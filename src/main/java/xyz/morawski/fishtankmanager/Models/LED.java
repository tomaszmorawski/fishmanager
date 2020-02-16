package xyz.morawski.fishtankmanager.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class LED {
    @Id
    private Long id;
    private String color;
}
