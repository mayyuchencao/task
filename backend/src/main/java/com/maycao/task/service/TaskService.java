package com.maycao.task.service;

import com.maycao.task.domain.CreateTaskRequest;
import com.maycao.task.domain.entity.Task;
import java.util.List;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);
}