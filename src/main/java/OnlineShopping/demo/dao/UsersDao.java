package OnlineShopping.demo.dao;

import OnlineShopping.demo.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDao extends CrudRepository<Users,Long> {
    Users findUserByUsername(String username);
}
