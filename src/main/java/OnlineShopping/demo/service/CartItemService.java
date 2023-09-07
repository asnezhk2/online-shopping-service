package OnlineShopping.demo.service;

import OnlineShopping.demo.model.Cart;
import OnlineShopping.demo.model.CartItem;

import java.util.List;

public interface CartItemService {
    public void addCartItem(CartItem cartItem);
    public void deleteCartItem(CartItem cartItem);
    public void removeAllCartItems(Cart cart);
    CartItem getCartItemByProduct(long productId);
    List<CartItem> findAllCartItemsBycart(Cart cart);
}
