package com.df.todo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.df.todo.domains.Todo;
import com.df.todo.repositories.TodoRepository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
