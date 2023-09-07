package OnlineShopping.demo.service;

import OnlineShopping.demo.model.Cart;

import java.io.IOException;

public interface CartService {
    public void addCart(Cart cart);

    public Cart getCartById(long cartId);

    Cart validateCustomer(long cartId) throws IOException;
}
