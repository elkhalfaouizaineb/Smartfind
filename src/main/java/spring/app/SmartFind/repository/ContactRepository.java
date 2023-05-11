package spring.app.SmartFind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.app.SmartFind.models.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
