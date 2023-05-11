package spring.app.SmartFind.service;

import java.util.List;

import spring.app.SmartFind.models.LocalisationManuel;

public interface LocalisationManuelService {
	public List<LocalisationManuel> getLocalisation();
	public LocalisationManuel ajouterLocalisation(LocalisationManuel localisation);
	public void supprimerLocalisation(long idlocalisation);
	public LocalisationManuel getLocalisation(long idlocalisation);
}
