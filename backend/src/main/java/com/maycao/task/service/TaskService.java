package com.maycao.task.service;

import com.maycao.task.domain.CreateTaskRequest;
import com.maycao.task.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();
}