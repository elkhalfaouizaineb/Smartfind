package spring.app.SmartFind.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.app.SmartFind.models.Account;
import spring.app.SmartFind.models.Contact;
import spring.app.SmartFind.models.Photo;
import spring.app.SmartFind.models.Utilisateur;
import spring.app.SmartFind.service.UtilisateurService;
import spring.ateliers.g2.atelier1.model.Tache;

@RestController
@RequestMapping("/personne")
public class UtilisateurController {

	@Autowired
	UtilisateurService UserService;
	
	@GetMapping("/user")
	public List<Utilisateur> getUser() {
		return UserService.getUtilisateur();
	}
	
	@PostMapping("/user")
	public Utilisateur addUser(@RequestBody Utilisateur user) {
		return UserService.ajouterUser(user);
	}

	@DeleteMapping("/user")
	public void SuppUser(@RequestParam long id) {
		UserService.supprimerUser(id);
	}

	@PutMapping("/user")
	public void modifier(@RequestBody Utilisateur u) {
		UserService.modifier(u);
	}
	
	
	@PostMapping("/{idUser}/{contact}")
	public void addUserContact(@PathVariable long  idUser,@RequestBody Contact contact) {
		 UserService.ajouterContact(idUser, contact);
	}
	
	@PostMapping("/{idUser}/{photo}")
	public void addUserPhoto(@PathVariable long  idUser,@RequestBody Photo photo) {
		 UserService.ajouterPhoto(idUser, photo);
	}
	
	@PostMapping("/{idUser}/{account}")
	public void addUserAccount(@PathVariable long  idUser,@RequestBody Account account) {
		 UserService.ajouterAccount(idUser, account);
	}
	
	@PostMapping("/user/{idUser}/{idLocal}")
	public void affecter(@PathVariable long idUser,@PathVariable long idLocal) {
		UserService.affecterLocalisation(idUser, idLocal);
	}
	
	@GetMapping("/{iduser}/contact")
	public List<Contact> getContacts(@PathVariable long idUser){
		return UserService.getContacts(idUser);
	}
	
	@GetMapping("/{iduser}/photo")
	public List<Photo> getPhotoss(@PathVariable long idUser){
		return UserService.getPhotos(idUser);
	}


}
