package com.workintech.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseErrorResponse {
    private Integer status;
    private String message;
    private Long timestamp;
}
