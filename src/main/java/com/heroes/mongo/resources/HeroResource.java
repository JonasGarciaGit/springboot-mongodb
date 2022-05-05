package com.heroes.mongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heroes.mongo.domain.Hero;
import com.heroes.mongo.services.HeroService;

@RestController
@RequestMapping(value = "/heroes")
public class HeroResource {

	@Autowired
	private HeroService service;
	
	@GetMapping()
	public ResponseEntity<List<Hero>> findAll(){
		List<Hero> heroes = service.findAll();
		return ResponseEntity.ok().body(heroes);
	}
}
