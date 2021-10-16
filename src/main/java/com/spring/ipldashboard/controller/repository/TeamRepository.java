package com.spring.ipldashboard.controller.repository;

import com.spring.ipldashboard.model.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long>{

    Team findByTeamName(String teamName);
    
}
