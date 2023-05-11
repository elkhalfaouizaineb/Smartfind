package spring.app.SmartFind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.app.SmartFind.models.Account;
import spring.app.SmartFind.models.Contact;
import spring.app.SmartFind.models.Localisation;
import spring.app.SmartFind.models.Photo;
import spring.app.SmartFind.models.Utilisateur;
import spring.app.SmartFind.repository.AccountRepository;
import spring.app.SmartFind.repository.ContactRepository;
import spring.app.SmartFind.repository.LocalisationRepository;
import spring.app.SmartFind.repository.PhotoRepository;
import spring.app.SmartFind.repository.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	UtilisateurRepository userRepository;
	
	@Autowired
	ContactRepository contactRepository;
	
	@Autowired
	LocalisationRepository locaRepository;
	
	@Autowired
	PhotoRepository photoRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	
	@Override
	public List<Utilisateur> getUtilisateur() {
		// TODO Auto-generated method stub
		return userRepository.getUtilisateur();
	}

	@Override
	public Utilisateur ajouterUser(Utilisateur user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void supprimerUser(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}

	@Override
	public Utilisateur getUser(long idUser) {
		// TODO Auto-generated method stub
		return (Utilisateur) userRepository.getById(idUser);
	}

	@Override
	public void modifier(Utilisateur user) {
		// TODO Auto-generated method stub
		Utilisateur u=getUser(user.getId());
		if(u!=null) {
			u.setEmail(user.getEmail());
			u.setNom(user.getNom());
			u.setPrenom(user.getPrenom());
			u.setInstagram(user.getInstagram());
			u.setLinkedIn(u.getLinkedIn());
			u.setFacebbook(user.getFacebbook());
			userRepository.save(u);
		}
	}

	@Override
	public void ajouterContact(long idUser, Contact contact) {
		// TODO Auto-generated method stub;
		Utilisateur user=getUser(idUser);
		if(user!=null) {
			contact.setUser(user);
			contactRepository.save(contact);
			
		}
		
	}



	@Override
	public void affecterLocalisation(long idUser, long idLocalisation) {
		// TODO Auto-generated method stub
		Utilisateur user= userRepository.findById(idUser).get();
		Localisation localisation= locaRepository.getById(idLocalisation);
		if(user != null && localisation != null) {
			user.getLocalisations().add(localisation);
			userRepository.save(user);
		}
	}



	@Override
	public void ajouterPhoto(long idUser, Photo photo) {
		// TODO Auto-generated method stub;
		Utilisateur user=getUser(idUser);
		if(user!=null) {
			photo.setUser(user);
			photoRepository.save(photo);
			
		}
		
	}

	@Override
	public void ajouterAccount(long idUser, Account account) {
		// TODO Auto-generated method stub
		Utilisateur user=getUser(idUser);
		if(user!=null) {
			account.setUser(user);
			accountRepository.save(account);
			
		}
	}

	@Override
	public List<Contact> getContacts(long iduser) {
		// TODO Auto-generated method stub
		return userRepository.getContacts(iduser);
	}

	@Override
	public List<Photo> getPhotos(long iduser) {
		// TODO Auto-generated method stub
		return userRepository.getPhotos(iduser);
	}

	


}
