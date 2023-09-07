package OnlineShopping.demo.dao;

import OnlineShopping.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Long> {
    Customer findUserByUsername(String username);

    Customer findCustomerByUsernameAndPassword(String username,String password);

}
