package spring.app.SmartFind.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.app.SmartFind.models.Contact;
import spring.app.SmartFind.models.Photo;
import spring.app.SmartFind.models.Utilisateur;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
	@Query("select user from Utilisateur user")
	List<Utilisateur> getUtilisateur();

	Utilisateur getById(long idUser);
	
	@Query(value="select c from Contact c where c.user.id=:id")
	List<Contact> getContacts(@Param("id") long id);
	
	@Query(value="select p from Photo p where p.user.id=:id")
	List<Photo> getPhotos(@Param("id") long id);


	
}
