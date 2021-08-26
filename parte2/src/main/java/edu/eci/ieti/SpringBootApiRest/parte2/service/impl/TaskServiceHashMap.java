package edu.eci.ieti.SpringBootApiRest.parte2.service.impl;


import edu.eci.ieti.SpringBootApiRest.parte2.data.Task;
import edu.eci.ieti.SpringBootApiRest.parte2.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {

    private final HashMap<String,Task> taskHashMap = new HashMap<>();

    @Override
    public Task create(Task task) {
        return this.taskHashMap.put(task.getId(),task);
    }

    @Override
    public Task findById(String id) {
        Task task = taskHashMap.get(id);
        return task;
    }

    @Override
    public List<Task> all() {
        return new ArrayList<Task>(taskHashMap.values());
    }

    @Override
    public Task deleteById(String id) {
        return this.taskHashMap.remove(id);
    }

    @Override
    public Task update(Task task, String id) {
        return this.taskHashMap.put(id,task);
    }
}
