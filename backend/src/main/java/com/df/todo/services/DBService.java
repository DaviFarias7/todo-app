package com.df.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.df.todo.domains.Todo;
import com.df.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular11", LocalDateTime.parse("04/06/2023 18:00", formatter) , false);
	
	todoRepository.saveAll(Arrays.asList(t1));
	}
}
