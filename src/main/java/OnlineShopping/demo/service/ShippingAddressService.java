package OnlineShopping.demo.service;

import OnlineShopping.demo.model.ShippingAddress;

import java.util.Optional;

public interface ShippingAddressService {
    public void addShippingAddress(ShippingAddress shippingAddress);

    Optional<ShippingAddress> getShippingAddressById(long shippingAddressId);
}
