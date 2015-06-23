package com.ninja_squad.geektic.modele;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Geek {
	
	@Id
    @GeneratedValue
    public Long idGeek;
    
    @Column(name="NOM")
    public String nom;
    
    @Column(name="PRENOM")
    public String prenom;
    
    @Column(name="EMAIL")
    public String email;
        
    @Column(name="VILLE")
    public String ville;
    
    @Column(name="SEXE")
    public String sexe;
    
    //Getter
    public Long getIdGeek() {
		return idGeek;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	public String getVille() {
		return ville;
	}

	public String getSexe() {
		return sexe;
	}

	//Constructeurs
    public Geek() {}
    
	public Geek(Long idGeek, String nom, String prenom, String email, String ville, String sexe) {
		super();
		this.idGeek = idGeek;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.ville = ville;
		this.sexe = sexe;
	}
    
   
}
