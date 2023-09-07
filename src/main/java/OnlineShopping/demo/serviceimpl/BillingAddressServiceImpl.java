package OnlineShopping.demo.serviceimpl;

import OnlineShopping.demo.dao.BillingAddressDao;
import OnlineShopping.demo.model.BillingAddress;
import OnlineShopping.demo.service.BillingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class BillingAddressServiceImpl implements BillingAddressService {
    @Autowired
    private BillingAddressDao billingAddressDao;
    //persisting and deleting objects requires a transaction in JPA. This we need to make sure a transaction is running, which we do by having the method annotated with @Transactional.
    @Transactional()
    @Override
    public void addBillingAddress(BillingAddress billingAddress) {
        billingAddressDao.save(billingAddress);
    }

    @Override
    public Optional<BillingAddress> getBillingAddressById(long billingAddressId) {
        return billingAddressDao.findById(billingAddressId);
    }

    }

