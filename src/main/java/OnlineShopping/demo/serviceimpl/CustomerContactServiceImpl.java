package OnlineShopping.demo.serviceimpl;

import OnlineShopping.demo.dao.CustomerContactDao;
import OnlineShopping.demo.model.CustomerContact;
import OnlineShopping.demo.service.CustomerContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CustomerContactServiceImpl implements CustomerContactService {
    private static final int PAGE_ELEMENT_SIZE = 10;
    @Autowired
    private CustomerContactDao customerContactDao;

    @Transactional()
    @Override
    public void addNewMessage(CustomerContact customerContact) {
        customerContactDao.save(customerContact);
    }

    @Transactional()
    @Override
    public void deleteMessageById(long customerContactId) {
        customerContactDao.deleteById(customerContactId);
    }

    @Transactional(readOnly = true)
    @Override
    public List<CustomerContact> getAllCustomerContact() {
        return (List<CustomerContact>) customerContactDao.findAll();
    }

    @Override
    public Page<CustomerContact> getAllCustomerMessage(Integer pageNumber) {
        return null;
    }

}

