package spring.app.SmartFind.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.app.SmartFind.models.Localisation;
import spring.app.SmartFind.service.LocalisationService;

@RestController
@RequestMapping("/localisation")
public class LocalisationController {
	@Autowired
	LocalisationService localisationService;
	
	@GetMapping
	public List<Localisation> getLocalisation() {
		return localisationService.getLocalisation();
	}

	@PostMapping
	public Localisation addUser(@RequestBody Localisation l) {
		return localisationService.ajouterLocalisation(l);
	}

	@DeleteMapping
	public void SuppUser(@RequestParam long id) {
		localisationService.supprimerLocalisation(id);;
	}

}
