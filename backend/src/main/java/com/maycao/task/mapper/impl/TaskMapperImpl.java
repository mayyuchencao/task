package com.maycao.task.mapper.impl;

import com.maycao.task.domain.CreateTaskRequest;
import com.maycao.task.domain.dto.CreateTaskRequestDto;
import com.maycao.task.domain.dto.TaskDto;
import com.maycao.task.domain.entity.Task;
import com.maycao.task.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}