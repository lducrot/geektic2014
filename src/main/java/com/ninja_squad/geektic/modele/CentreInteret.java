package com.ninja_squad.geektic.modele;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name="CENTREINTERET")
public class CentreInteret {
	
	@Id
    @GeneratedValue
    public Long idCentreInteret;
    
    @Column(name="LIBELLE")
    public String libelle;
    
    @ManyToMany(mappedBy="centreInterets")
    private Set<Geek> geeks;
    
    public Long getIdCentreInteret() {
		return idCentreInteret;
	}

	public String getLibelle() {
		return libelle;
	}

	//Constructeurs
    public CentreInteret() {}
    
	public CentreInteret(Long idCentreInteret, String libelle) {
		super();
		this.idCentreInteret = idCentreInteret;
		this.libelle = libelle;
	}


}
