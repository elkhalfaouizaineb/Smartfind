package spring.app.SmartFind.service;

import java.util.List;

import spring.app.SmartFind.models.Account;
import spring.app.SmartFind.models.Contact;
import spring.app.SmartFind.models.Photo;
import spring.app.SmartFind.models.Utilisateur;



public interface UtilisateurService {
	public List<Utilisateur> getUtilisateur();
	public Utilisateur ajouterUser(Utilisateur user);
	public void supprimerUser(long iduser);
	public Utilisateur getUser(long idUser);
	public List<Contact>  getContacts(long iduser);
	public List<Photo>  getPhotos(long iduser);
	public void modifier(Utilisateur user);
	public void ajouterContact(long idUser,Contact contact);
	public void ajouterPhoto(long idUser,Photo photo);
	public void ajouterAccount(long idUser,Account account);
	void affecterLocalisation(long idUser,long idLocalisation);
}
