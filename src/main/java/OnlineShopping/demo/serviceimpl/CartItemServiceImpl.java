package OnlineShopping.demo.serviceimpl;

import OnlineShopping.demo.dao.CartItemDao;
import OnlineShopping.demo.model.Cart;
import OnlineShopping.demo.model.CartItem;
import OnlineShopping.demo.service.CartItemService;
import OnlineShopping.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CartItemServiceImpl implements CartItemService {
    @Autowired
    private ProductService productService;

    @Autowired
    private CartItemDao cartItemDao;
    @Transactional()
    @Override
    public void addCartItem(CartItem cartItem) {
        cartItemDao.save(cartItem);

    }
    @Transactional()
    @Override
    public void deleteCartItem(CartItem cartItem) {
        cartItemDao.deleteCartItemById(cartItem.getCartItemId());
    }

    @Override
    public void removeAllCartItems(Cart cart) {
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            deleteCartItem(item);
        }
    }
    @Transactional(readOnly = true)
    @Override
    public CartItem getCartItemByProduct(long productId) {
        List<CartItem> cartItems=cartItemDao.findUserByProduct(productService.getProductById(productId));

        return cartItems.get(0);
    }
    @Transactional(readOnly = true)
    @Override
    public List<CartItem> findAllCartItemsBycart(Cart cart) {
        return cartItemDao.findAllCartItemsByCart(cart);
    }
}
