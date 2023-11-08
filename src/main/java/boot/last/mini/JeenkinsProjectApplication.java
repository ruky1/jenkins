package boot.last.mini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("boot.*")
public class JeenkinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeenkinsProjectApplication.class, args);
	}

}
