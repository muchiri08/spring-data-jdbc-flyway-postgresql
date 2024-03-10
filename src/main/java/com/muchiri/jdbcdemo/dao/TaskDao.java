package com.muchiri.jdbcdemo.dao;

import com.muchiri.jdbcdemo.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findAll();

    Task findByTaskId(int taskId);

    Task save(Task task);

    void deleteByTaskId(int taskId);
}
