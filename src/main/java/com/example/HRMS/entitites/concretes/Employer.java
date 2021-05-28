package com.example.HRMS.entitites.concretes;

import com.example.HRMS.entitites.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employer extends User {
    @SequenceGenerator(
            name = "employer_sequence",
            sequenceName = "employer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employer_sequence"

    )
    @Id
    private Long id;
    private String corporationName;
    private String webSite;
    private String phoneNumber;
    private boolean confirmation;



}
