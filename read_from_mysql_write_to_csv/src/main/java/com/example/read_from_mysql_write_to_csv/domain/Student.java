package com.example.read_from_mysql_write_to_csv.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private int id;
    private String name;
    private String rollNumber;
}
