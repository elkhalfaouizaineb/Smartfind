package spring.app.SmartFind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.app.SmartFind.models.Photo;
@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {

}
