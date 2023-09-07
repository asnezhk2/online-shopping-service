package OnlineShopping.demo.dao;

import OnlineShopping.demo.model.BillingAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingAddressDao extends CrudRepository<BillingAddress, Long> {
}
