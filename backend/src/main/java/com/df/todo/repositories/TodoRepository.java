package com.df.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.df.todo.domains.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
