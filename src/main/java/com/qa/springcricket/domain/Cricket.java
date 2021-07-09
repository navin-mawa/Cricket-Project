package com.qa.springcricket.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Cricket {
	
	// Variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int noOfPlayers;
	private String stadiumName;
	private int yearFounded;
	
	
	public Cricket() {
		
	}
	public Cricket(String name, int noOfPlayers, String stadiumName, int yearFounded ) {
		this.name = name;
		this.noOfPlayers = noOfPlayers;
		this.stadiumName = stadiumName;
		this.yearFounded = yearFounded;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public int getYearFounded() {
		return yearFounded;
	}
	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}
	
	
	

}
