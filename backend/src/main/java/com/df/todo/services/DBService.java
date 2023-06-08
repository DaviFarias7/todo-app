package com.df.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.df.todo.domains.Todo;
import com.df.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular11", sdf.parse("04/06/2023") , false);
	Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento de software", sdf.parse("05/06/2023" ) , true);
	Todo t3 = new Todo(null, "Exercicios", "Praticar exerrcicios", sdf.parse("05/06/2023"), false);
	Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos", sdf.parse("05/06/2023") , true);
	
	todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
