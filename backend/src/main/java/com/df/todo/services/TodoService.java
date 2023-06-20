package com.df.todo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.df.todo.domains.Todo;
import com.df.todo.repositories.TodoRepository;
import com.df.todo.services.exceptions.ObjectNotFoundException;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;
	public Todo findById(Integer id) {
		Optional<Todo> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(("Objeto não encontrado" + id + Todo.class.getName())));
	}

	public List<Todo> findAllOpen() {
		List<Todo> list = repository.findAllOpen();
		return list;
	}

	public List<Todo> findAllclose() {
		List<Todo> list = repository.findAllClose();
		return list;
	}
	
	public void deleteClosedById(Integer id) {
		List<Todo> list = repository.findAllClose();
	    Todo itemToDelete = list.stream()
	        .filter(todo -> todo.getId().equals(id))
	        .findFirst()
	        .orElseThrow(() -> new NoSuchElementException("Item não encontrado"));

	    repository.delete(itemToDelete);
	}

	public List<Todo> findAll() {
		List<Todo> list = repository.findAll();
		return list;
	}

	public Todo create(Todo obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

	public Todo update(Integer id, Todo obj) {
		Todo newObj = findById(id);
		newObj.setTitulo(obj.getTitulo());
		newObj.setDataParaFinalizar(obj.getDataParaFinalizar());
		newObj.setDescricao(obj.getDescricao());
		newObj.setFinalizado(obj.getFinalizado());
		return repository.save(newObj);
	}
}
