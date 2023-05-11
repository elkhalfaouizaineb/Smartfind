package spring.app.SmartFind.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.app.SmartFind.models.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
