package OnlineShopping.demo.dao;

import OnlineShopping.demo.model.PersistentLogin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RememberMeTokenRepository extends CrudRepository<PersistentLogin, Long> {
    PersistentLogin findBySeries(String series);
    List<PersistentLogin> findByUsername(String username);

    void delete(List<PersistentLogin> persistentLogins);
}
