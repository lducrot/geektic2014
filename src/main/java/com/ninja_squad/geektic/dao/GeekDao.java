package com.ninja_squad.geektic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ninja_squad.geektic.modele.Geek;

@Repository
public class GeekDao {

	@PersistenceContext
	public EntityManager em;

	//Constructeur
    public GeekDao() {}
    
    
    public List<Geek> findById(Long id) throws IOException {
        String query = "SELECT g FROM GEEK g WHERE g.idGeek= :idGeek";
        List<Geek> listG = em.createQuery(query, Geek.class).setParameter("idGeek", id).getResultList();
        return listG;
    }
    
    public List<Geek> findBySexe(String sexe) throws IOException {
        String query = "SELECT g FROM GEEK g WHERE g.sexe= :sexe";
        List<Geek> listG = em.createQuery(query, Geek.class).setParameter("sexe", sexe).getResultList();
        return listG;
    }
    
    /*public List<Geek> findByIdAndSexe(Long id, String sexe) throws IOException {
        String query = "SELECT g FROM GEEK g WHERE g.idGeek = :idGeek AND g.sexe= :sexe";
        List<Geek> listG = em.createQuery(query, Geek.class).setParameter("idGeek", id).getResultList();
        listG = em.createQuery(query, Geek.class).setParameter("sexe", sexe).getResultList();
        return listG;
    }*/
    
    /*public List<Geek> findByCentreInteret_2(List<String> centreInterets) throws IOException {
       
        if(centreInterets.isEmpty()) return new ArrayList<Geek>();

        String query = "SELECT DISTINCT g FROM GEEK g JOIN g.CENTREINTERET ci WHERE ci.libelle IN(:centreInterets) ORDER BY g.nom";

        return em.createQuery(query, Geek.class)
                .setParameter("centreInterets", centreInterets)
                .getResultList();
    }
    public List<Geek> findByCentreInteret(Long idCentreInteret) throws IOException 
    {
    	String query = "SELECT g FROM GEEK g JOIN LIEN_GEEK_CI lgci JOIN CENTREINTERET ci WHERE idCentreInteret = :idCentreInteret ORDER BY g.nom";
        List<Geek> listG = em.createQuery(query, Geek.class).setParameter("idCentreInteret", idCentreInteret).getResultList();
        return listG;
    }*/
    
	
}
