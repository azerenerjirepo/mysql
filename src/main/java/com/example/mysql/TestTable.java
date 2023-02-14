package com.example.mysql;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class TestTable {

    @Id
    private Long ID;
    private String NAME;
    private String Registratedplace;
}
