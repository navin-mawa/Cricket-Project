package com.qa.springcricket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springcricket.domain.Cricket;

@Repository
public interface CricketRepo extends JpaRepository<Cricket, Long>{
	
}




