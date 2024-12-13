package com.example.Student_New1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
            title="Student OPEN API",
				version = "1.0.0",
				description="Student OPEN API documentation"
		),
		servers = @Server(
            url ="http://localhost:8080",
				description="Student OPEN API url"
		)
)
public class StudentNew1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentNew1Application.class, args);
	}

}
