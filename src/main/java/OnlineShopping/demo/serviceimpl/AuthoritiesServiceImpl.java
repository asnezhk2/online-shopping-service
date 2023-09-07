package OnlineShopping.demo.serviceimpl;

import OnlineShopping.demo.dao.AuthoritiesDao;
import OnlineShopping.demo.model.Authorities;
import OnlineShopping.demo.service.AuthoritiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class AuthoritiesServiceImpl implements AuthoritiesService {
    @Autowired
    private AuthoritiesDao authoritiesDao;
    @Transactional()
    @Override
    public void addAuthorities(Authorities authorities) {
        authoritiesDao.save(authorities);
    }
    @Transactional(readOnly = true)
    @Override
    public Authorities findAuthoritiesByUsername(String username) {
        return authoritiesDao.findAuthoritiesByUsername(username);
    }
}
