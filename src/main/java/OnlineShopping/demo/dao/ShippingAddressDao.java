package OnlineShopping.demo.dao;

import OnlineShopping.demo.model.ShippingAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingAddressDao extends CrudRepository<ShippingAddress,Long> {
}
