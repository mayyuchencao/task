package com.maycao.task.mapper;

import com.maycao.task.domain.dto.CreateTaskRequestDto;
import com.maycao.task.domain.CreateTaskRequest;
import com.maycao.task.domain.dto.TaskDto;
import com.maycao.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);
}