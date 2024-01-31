package official.my_map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MyMapApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMapApplication.class, args);
	}

}
