package OnlineShopping.demo.serviceimpl;

import OnlineShopping.demo.dao.CustomerOrderDao;
import OnlineShopping.demo.model.Cart;
import OnlineShopping.demo.model.CartItem;
import OnlineShopping.demo.model.CustomerOrder;
import OnlineShopping.demo.service.CartService;
import OnlineShopping.demo.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class CustomerOrderServiceImpl implements CustomerOrderService {
    @Autowired
    private CustomerOrderDao customerOrderDao;
    @Autowired
    private CartService cartService;
    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {
        Cart cart = customerOrder.getCart();

        CustomerOrder oldCustomerOrder = customerOrderDao.getCustomerOrderByCart(cart);
        if (oldCustomerOrder != null) {
            oldCustomerOrder.setCustomer(cart.getCustomer());
            oldCustomerOrder.setShippingAddress(cart.getCustomer().getShippingAddress());
            oldCustomerOrder.setBillingAddress(cart.getCustomer().getBillingAddress());
            customerOrderDao.save(oldCustomerOrder);

        }
        else {
            customerOrder.setCustomer(cart.getCustomer());
            customerOrder.setShippingAddress(cart.getCustomer().getShippingAddress());
            customerOrder.setBillingAddress(cart.getCustomer().getBillingAddress());

            customerOrderDao.save(customerOrder);
        }
    }
    @Transactional(readOnly = true)
    @Override
    public double getCustomerOrderGrandTotal(long cartId) {

        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);


        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem cartItem : cartItems) {
            grandTotal += cartItem.getTotalPrice();
        }

        return grandTotal;
    }
    @Transactional(readOnly = true)
    @Override
    public CustomerOrder getCustomerOrderByCart(Cart cart) {
        return customerOrderDao.getCustomerOrderByCart(cart);
    }
    @Transactional(readOnly = true)
    @Override
    public List<CustomerOrder> getAllCustomerOrder() {
        return (List<CustomerOrder>) customerOrderDao.findAll();
    }
    @Transactional(readOnly = true)
    @Override
    public Optional<CustomerOrder> getCustomerOrderById(long customerOrderId) {
        return customerOrderDao.findById(customerOrderId);
    }
    @Transactional()
    @Override
    public void deleteCustomerOrderById(long customerOrderId) {
        customerOrderDao.deleteById(customerOrderId);
    }
}
