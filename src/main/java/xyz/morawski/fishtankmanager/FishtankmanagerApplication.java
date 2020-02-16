package xyz.morawski.fishtankmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class FishtankmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FishtankmanagerApplication.class, args);
	}

}
