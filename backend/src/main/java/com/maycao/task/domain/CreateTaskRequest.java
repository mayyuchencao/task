package com.maycao.task.domain;

import com.maycao.task.domain.entity.TaskPriority;
import java.time.LocalDate;

public record CreateTaskRequest (
    String title,
    String description,
    LocalDate dueDate,
    TaskPriority priority
) {}