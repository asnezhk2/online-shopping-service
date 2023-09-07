package OnlineShopping.demo.dao;

import OnlineShopping.demo.model.Cart;
import OnlineShopping.demo.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderDao extends CrudRepository<CustomerOrder,Long> {
    CustomerOrder getCustomerOrderByCart(Cart cart);

    CustomerOrder findOne(long customerOrderId);

}
