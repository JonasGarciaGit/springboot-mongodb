package com.heroes.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.heroes.mongo.domain.Hero;

@Repository
public interface HeroRepository extends MongoRepository<Hero, String>{

}
