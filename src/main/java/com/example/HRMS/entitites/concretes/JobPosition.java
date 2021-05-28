package com.example.HRMS.entitites.concretes;

import javax.persistence.*;

@Entity
@Table
public class JobPosition {
    @SequenceGenerator(
            name = "job_sequence",
            sequenceName = "job_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "job_sequence"

    )
    @Id
    private Long Id;
    private String position;

}
