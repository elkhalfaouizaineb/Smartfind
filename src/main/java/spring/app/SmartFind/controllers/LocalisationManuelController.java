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

import spring.app.SmartFind.models.LocalisationManuel;
import spring.app.SmartFind.service.LocalisationManuelService;


@RestController
@RequestMapping("/localisationM")
public class LocalisationManuelController {
	@Autowired
	LocalisationManuelService localisationMService;
	
	@GetMapping
	public List<LocalisationManuel> getLocalisation() {
		return localisationMService.getLocalisation();
	}

	@PostMapping
	public LocalisationManuel addUser(@RequestBody LocalisationManuel l) {
		return localisationMService.ajouterLocalisation(l);
	}

	@DeleteMapping
	public void SuppUser(@RequestParam long id) {
		localisationMService.supprimerLocalisation(id);;
	}

}
