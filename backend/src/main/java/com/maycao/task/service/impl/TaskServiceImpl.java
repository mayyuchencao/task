package com.maycao.task.service.impl;

import com.maycao.task.domain.CreateTaskRequest;
import com.maycao.task.domain.entity.Task;
import com.maycao.task.service.TaskService;
import com.maycao.task.domain.entity.TaskStatus;
import com.maycao.task.repository.TaskRepository;
import java.time.Instant;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();

        Task task = new Task(
            null,
            request.title(),
            request.description(),
            request.dueDate(),
            TaskStatus.OPEN,
            request.priority(),
            now,
            now
        );

        return taskRepository.save(task);
    }

}