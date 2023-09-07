package OnlineShopping.demo.service;

import OnlineShopping.demo.model.Authorities;
import org.springframework.stereotype.Repository;

public interface AuthoritiesService {
    public void addAuthorities(Authorities authorities);
    Authorities findAuthoritiesByUsername(String username);
}
