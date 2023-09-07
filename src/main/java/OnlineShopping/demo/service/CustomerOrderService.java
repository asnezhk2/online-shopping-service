package OnlineShopping.demo.service;

import OnlineShopping.demo.model.Cart;
import OnlineShopping.demo.model.CustomerOrder;

import java.util.List;
import java.util.Optional;

public interface CustomerOrderService {
    public void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(long cartId);
    CustomerOrder getCustomerOrderByCart(Cart cart);
    List<CustomerOrder> getAllCustomerOrder();

    public Optional<CustomerOrder> getCustomerOrderById(long customerOrderId);
    public void deleteCustomerOrderById(long customerOrderId);
}
