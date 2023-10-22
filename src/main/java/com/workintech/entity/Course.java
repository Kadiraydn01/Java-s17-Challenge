package com.workintech.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    private int id;
    private String name;
    private int credit;
    private Grade grade;

    public Course(int id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;

    }
}
