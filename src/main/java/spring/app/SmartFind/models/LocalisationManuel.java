package spring.app.SmartFind.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LocalisationManuel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String immeuble;
	private String numeroPorte;
	private String zone;
	private String Secteur;
	private String codepostal;
	private String ville;
	private String pays;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImmeuble() {
		return immeuble;
	}
	public void setImmeuble(String immeuble) {
		this.immeuble = immeuble;
	}
	public String getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(String numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getSecteur() {
		return Secteur;
	}
	public void setSecteur(String secteur) {
		Secteur = secteur;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
}
