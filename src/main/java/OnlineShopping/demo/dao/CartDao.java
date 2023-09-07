package OnlineShopping.demo.dao;

import OnlineShopping.demo.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDao extends CrudRepository<Cart, Long> {
    Cart findUserByCartId(long cartId);

}
