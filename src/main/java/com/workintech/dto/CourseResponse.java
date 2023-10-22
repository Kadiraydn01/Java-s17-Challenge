package com.workintech.dto;

import com.workintech.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Iterator;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseResponse {
    private Course course;
    private double totalGpa;

}
