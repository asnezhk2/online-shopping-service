package OnlineShopping.demo.service;

import OnlineShopping.demo.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    public void addCustomer(Customer customer);
    public Customer findCustomerByUsername(String username);

    List<Customer> getAllCustomers();

    public Optional<Customer> getCustomerByCustomerId(long customerId);

    Customer findCustomerByUsernameAndPassword(String username,String password);
}
