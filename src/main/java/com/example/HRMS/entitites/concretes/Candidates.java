package com.example.HRMS.entitites.concretes;

import com.example.HRMS.entitites.abstracts.User;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Candidates extends User {
    @SequenceGenerator(
            name = "candidates_sequence",
            sequenceName = "candidates_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "candidates_sequence"

    )
    @Id
    private Long Id;
    private String firstName;
    private String lastName;
    private String nationalIdentity;
    private Date birthDate;

}
