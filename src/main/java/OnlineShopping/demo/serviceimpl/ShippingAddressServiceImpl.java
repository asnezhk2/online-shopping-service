package OnlineShopping.demo.serviceimpl;

import OnlineShopping.demo.dao.ShippingAddressDao;
import OnlineShopping.demo.model.ShippingAddress;
import OnlineShopping.demo.service.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class ShippingAddressServiceImpl implements ShippingAddressService {
    @Autowired
    private ShippingAddressDao shippingAddressDao;
    @Transactional()
    @Override
    public void addShippingAddress(ShippingAddress shippingAddress) {
        shippingAddressDao.save(shippingAddress);
    }
    @Transactional(readOnly = true)
    @Override
    public Optional<ShippingAddress> getShippingAddressById(long shippingAddressId) {
        return shippingAddressDao.findById(shippingAddressId);
    }
}
