package OnlineShopping.demo.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 3L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;
    @NotEmpty
    @Size(min=5,max=30)
    private String customerName;
    @NotEmpty
    @Email
    private String customerEmailAddress;
    @NotEmpty
    //TODO PHONE ANNOTATION?
    private String customerPhoneNumber;
    @NotEmpty
    @Size(min=5,max=30)
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    private boolean enabled;
    @Valid
    @OneToOne
    @JoinColumn(name = "billingAddressId")
    private String shippingAddress;
    @Valid
    @OneToOne
    @JoinColumn(name="billingAddressId")
    private BillingAddress billingAddress;
    @OneToOne
    @JoinColumn(name="cartId")
    private Cart cart;

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
