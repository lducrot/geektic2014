package com.ninja_squad.geektic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.ninja_squad.geektic.modele.Geek;

@Repository
public class GeekDao {

	@PersistenceContext
	public EntityManager em;

	//Constructeur
    public GeekDao() {}
    
    /*public List<Geek> findAll() {
        String query = "SELECT * FROM GEEK g ";
        List<Geek> listG = em.createQuery(query, Geek.class).getResultList();
        return listG;
    }
    
    public Geek findById(Long id) {
        return em.find(Geek.class, id);
    }*/
    
    public List<Geek> findById(Long id) {
        String query = "SELECT g FROM GEEK g WHERE g.IDGEEK = :idGeek";
        List<Geek> listG = em.createQuery(query, Geek.class).setParameter("idGeek", id).getResultList();
        return listG;
    }
    
    /*public void persist(Geek g) {
        em.persist(g);
    }*/
	
}
