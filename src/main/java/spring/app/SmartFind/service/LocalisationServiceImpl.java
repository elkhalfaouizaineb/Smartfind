package spring.app.SmartFind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.app.SmartFind.models.Localisation;
import spring.app.SmartFind.repository.LocalisationRepository;
@Service
public class LocalisationServiceImpl implements LocalisationService {


	@Autowired
	LocalisationRepository locaRepository;

	@Override
	public List<Localisation> getLocalisation() {
		// TODO Auto-generated method stub
		return locaRepository.getlocalisation();
	}

	@Override
	public Localisation ajouterLocalisation(Localisation localisation) {
		// TODO Auto-generated method stub
		return locaRepository.save(localisation);
	}

	@Override
	public void supprimerLocalisation(long idlocalisation) {
		
		locaRepository.deleteById(idlocalisation);
	}

	@Override
	public Localisation getLocalisation(long idlocalisation) {
		// TODO Auto-generated method stub
		return  locaRepository.getById(idlocalisation);
	}


}
