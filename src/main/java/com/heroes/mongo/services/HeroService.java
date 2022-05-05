package com.heroes.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heroes.mongo.domain.Hero;
import com.heroes.mongo.repository.HeroRepository;

@Service
public class HeroService {

	@Autowired
	private HeroRepository repository;
	
	public List<Hero> findAll(){
		return repository.findAll();
	}
}
