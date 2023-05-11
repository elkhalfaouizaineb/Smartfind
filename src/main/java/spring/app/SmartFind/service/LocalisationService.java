package spring.app.SmartFind.service;

import java.util.List;

import spring.app.SmartFind.models.Localisation;


public interface LocalisationService {
	public List<Localisation> getLocalisation();
	public Localisation ajouterLocalisation(Localisation localisation);
	public void supprimerLocalisation(long idlocalisation);
	public Localisation getLocalisation(long idlocalisation);

}
