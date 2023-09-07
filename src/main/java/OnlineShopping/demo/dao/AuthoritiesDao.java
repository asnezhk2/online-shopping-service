package OnlineShopping.demo.dao;

import OnlineShopping.demo.model.Authorities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesDao extends CrudRepository<Authorities, Long> {
    Authorities findAuthoritiesByUsername(String username);
}
