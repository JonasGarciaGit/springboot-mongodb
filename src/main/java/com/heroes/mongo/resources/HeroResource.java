package com.heroes.mongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heroes.mongo.domain.Hero;

@RestController
@RequestMapping(value = "/heroes")
public class HeroResource {

	@GetMapping()
	public ResponseEntity<List<Hero>> findAll(){
		Hero flash = new Hero("1", "Flash", 20);
		Hero spiderMan = new Hero("2", "Spider-Man", 10);
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.addAll(Arrays.asList(flash, spiderMan));
		return ResponseEntity.ok().body(heroes);
	}
}
