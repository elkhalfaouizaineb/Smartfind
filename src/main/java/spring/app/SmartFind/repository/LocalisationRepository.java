package spring.app.SmartFind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.app.SmartFind.models.Localisation;
@Repository
public interface LocalisationRepository extends JpaRepository<Localisation, Long> {
	@Query("select l from Localisation l")
	List<Localisation> getlocalisation();

	Localisation getById(long idLocaliation);
}
