package com.ninja_squad.geektic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

import com.ninja_squad.geektic.modele.CentreInteret;
import com.ninja_squad.geektic.modele.Geek;

@Repository
public class CentreInteretDao {

	@PersistenceContext
	public EntityManager em;

	//Constructeur
    public CentreInteretDao() {}
    
    
      
	
}
