package edu.eci.ieti.SpringBootApiRest.parte2.service;

import edu.eci.ieti.SpringBootApiRest.parte2.data.Task;

import java.util.List;

public interface TaskService {
    Task create(Task task );
    Task findById( String id );
    List<Task> all();
    void deleteById( String id );
    Task update( Task task, String id );
}
