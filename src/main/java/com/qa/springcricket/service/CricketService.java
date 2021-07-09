package com.qa.springcricket.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.springcricket.domain.Cricket;
import com.qa.springcricket.repo.CricketRepo;

@Service

public class CricketService {
	
	
	private CricketRepo repo;
	
	public CricketService(CricketRepo repo) {
		this.repo = repo;
		
		}
	
	public Cricket ball(Cricket Game) {
		return this.repo.saveAndFlush(Game);
		
	}
	
	public List<Cricket> wickets() {
		return this.repo.findAll();
		
	}
	public Cricket update(Long id, Cricket newgame) {
		Cricket existing = this.repo.getById(id);
		existing.setName(newgame.getName());
		existing.setNoOfPlayers(newgame.getNoOfPlayers());
		existing.setStadiumName(newgame.getStadiumName());
		existing.setYearFounded(newgame.getYearFounded());
		
		Cricket updated = this.repo.save(existing);
		return updated;
	}
	
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
