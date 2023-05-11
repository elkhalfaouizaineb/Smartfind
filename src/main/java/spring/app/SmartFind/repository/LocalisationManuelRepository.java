package spring.app.SmartFind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.app.SmartFind.models.LocalisationManuel;
@Repository
public interface LocalisationManuelRepository extends JpaRepository<LocalisationManuel, Long> {
	@Query("select l from LocalisationManuel l")
	List<LocalisationManuel> getlocalisationM();

	LocalisationManuel getById(long idLocaliation);
}
