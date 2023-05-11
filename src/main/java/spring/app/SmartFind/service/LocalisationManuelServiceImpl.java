package spring.app.SmartFind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.app.SmartFind.models.LocalisationManuel;
import spring.app.SmartFind.repository.LocalisationManuelRepository;
@Service
public class LocalisationManuelServiceImpl implements LocalisationManuelService{

	@Autowired
	LocalisationManuelRepository LMR;
	
	@Override
	public List<LocalisationManuel> getLocalisation() {
		// TODO Auto-generated method stub
		return LMR.getlocalisationM();
	}

	@Override
	public LocalisationManuel ajouterLocalisation(LocalisationManuel localisation) {
		// TODO Auto-generated method stub
		return LMR.save(localisation);
	}

	@Override
	public void supprimerLocalisation(long idlocalisation) {
		// TODO Auto-generated method stub
		LMR.deleteById(idlocalisation);
	}

	@Override
	public LocalisationManuel getLocalisation(long idlocalisation) {
		// TODO Auto-generated method stub
		return  LMR.getById(idlocalisation);
	}

}
