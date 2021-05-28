package com.example.HRMS.dataAccess.abstracts;

import com.example.HRMS.entitites.concretes.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CandidatesDao extends JpaRepository<Candidates, Long>{

}
