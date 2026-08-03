package com.maycao.task.domain;

public record UpdateTaskRequest (
    String title,
    String description,
    LocalDate dueDate,
    TaskStatus status,
    TaskPriority priority
) {}