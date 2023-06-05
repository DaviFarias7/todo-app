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
	Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento de software", LocalDateTime.parse("05/06/2023 15:00", formatter) , true);
	Todo t3 = new Todo(null, "Exercicios", "Praticar exerrcicios", LocalDateTime.parse("05/06/2023 16:00", formatter) , false);
	Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos", LocalDateTime.parse("05/06/2023 17:00", formatter) , true);
	
	todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
