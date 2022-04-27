package spring.udemy.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}


}
