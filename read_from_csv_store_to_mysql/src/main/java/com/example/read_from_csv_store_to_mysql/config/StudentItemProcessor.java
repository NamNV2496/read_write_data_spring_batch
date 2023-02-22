package com.example.read_from_csv_store_to_mysql.config;

import com.example.read_from_csv_store_to_mysql.domain.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentItemProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {
        return student;
    }
}