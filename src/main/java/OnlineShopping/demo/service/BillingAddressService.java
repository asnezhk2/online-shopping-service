package OnlineShopping.demo.service;

import OnlineShopping.demo.model.BillingAddress;

import java.util.Optional;

public interface BillingAddressService {
    public void addBillingAddress(BillingAddress billingAddress);
    Optional<BillingAddress> getBillingAddressById(long billingAddressId);
}
