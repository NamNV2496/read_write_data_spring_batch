package com.example.read_from_mysql_write_to_csv.config;

import com.example.read_from_mysql_write_to_csv.domain.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentItemProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {
        return student;
    }
}