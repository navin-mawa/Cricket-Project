package com.qa.springcricket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springcricket.domain.Cricket;
import com.qa.springcricket.service.CricketService;

@RestController
@RequestMapping("/cricket") //http://localhost:1703/cricket/......

public class CricketController {
	
	
	private CricketService service;
	
	@Autowired
	public CricketController(CricketService service) {
		this.service = service;
		
	}
	
	
	
	
	@GetMapping("/bat")
	public String bat() {
		return "National Game of England is cricket";
		
	}

	@PostMapping("/ball")
	public ResponseEntity<Cricket> ball(@RequestBody Cricket game) {
		return new ResponseEntity<Cricket>(this.service.ball(game), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/wickets")
	public ResponseEntity<List<Cricket>> wickets() {
		return new ResponseEntity<List<Cricket>>(this.service.wickets(), HttpStatus.OK);
		
	}
	
	@PutMapping("/gloves/{id}")
	public ResponseEntity<Cricket> update(@PathVariable Long id, @RequestBody Cricket game) {
		return new ResponseEntity<Cricket>(this.service.update(id,game), HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/pads/{id}")
	public ResponseEntity<Boolean> pads(@PathVariable Long id) {
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
		
		
	}
	
	
	
	
	
	
	
}
