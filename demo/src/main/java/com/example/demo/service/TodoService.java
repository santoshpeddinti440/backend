package com.example.demo.service;

import com.example.demo.entity.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAll();  // read the data

    Todo findById(int theId); // get the data with id

    Todo save(Todo theTodo);  // save and update the data

    void deleteById(int theId); // delete the data

}
