package OnlineShopping.demo.dao;

import OnlineShopping.demo.model.CustomerContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerContactDao extends CrudRepository<CustomerContact, Long>, PagingAndSortingRepository<CustomerContact, Long> {
}
