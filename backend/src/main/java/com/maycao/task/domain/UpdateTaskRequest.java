package com.maycao.task.domain;

import com.maycao.task.domain.entity.TaskPriority;
import com.maycao.task.domain.entity.TaskStatus;
import java.time.LocalDate;

public record UpdateTaskRequest (
    String title,
    String description,
    LocalDate dueDate,
    TaskStatus status,
    TaskPriority priority
) {}