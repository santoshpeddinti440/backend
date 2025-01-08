package com.example.demo.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "todos")
public class Todo {

//    private fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id")
    private int id;

    @Column(name = "todo_name")
    private String todo_name;

    @Column(name = "todo_desc")
    private String todo_message;

    // default constructor

    public Todo(){

    }

    public Todo(String todo_name, String todo_message) {
        this.todo_name = todo_name;
        this.todo_message = todo_message;
    }

    //getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodo_name() {
        return todo_name;
    }

    public void setTodo_name(String todo_name) {
        this.todo_name = todo_name;
    }

    public String getTodo_message() {
        return todo_message;
    }

    public void setTodo_message(String todo_message) {
        this.todo_message = todo_message;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", todo_name='" + todo_name + '\'' +
                ", todo_message='" + todo_message + '\'' +
                '}';
    }
}
