package com.example.CrudApiImplementation.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;

@Data
@Entity
@Table(name="employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String f_name;
    private String l_name;
    private String email;
}
