package com.programar.todo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.programar.todo.domain.Todo;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm");
		
        Todo t1 = new Todo(null, 
        		          "Estudar", 
        		          "Estudar Spring Boot 2 e angular 12", 
        		          LocalDateTime.parse("25/03/2022 17:53",formatter), 
        		          false);	
	}

}
