package spring.app.SmartFind.models;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Utilisateur{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String prenom;
	private String email;
	private String facebbook;
	private String linkedIn;
	private String instagram;

	
	@ManyToMany
    @JoinTable(name="localisation_user",joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns=@JoinColumn(name="localisation_id"))
	private List<Localisation> localisations; 
	
	
	@ManyToMany
    @JoinTable(name="localisationM_user",joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns=@JoinColumn(name="localisationM_id"))
	private List<LocalisationManuel> localisationsM; 
	
	
	
	public List<LocalisationManuel> getLocalisationsM() {
		return localisationsM;
	}

	public void setLocalisationsM(List<LocalisationManuel> localisationsM) {
		this.localisationsM = localisationsM;
	}

	public List<Localisation> getLocalisations() {
		return localisations;
	}

	public void setLocalisations(List<Localisation> localisations) {
		this.localisations = localisations;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFacebbook() {
		return facebbook;
	}
	
	public void setFacebbook(String facebbook) {
		this.facebbook = facebbook;
	}
	
	public String getLinkedIn() {
		return linkedIn;
	}
	
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	
	public String getInstagram() {
		return instagram;
	}
	
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}



	
	
	
}
