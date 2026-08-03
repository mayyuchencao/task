package com.maycao.task.domain.dto;

import com.maycao.task.domain.TaskPriority;
import com.maycao.task.domain.TaskStatus;
import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
    UUID id,
    String title,
    String description,
    LocalDate dueDate,
    TaskPriority priority,
    TaskStatus status
) {

}