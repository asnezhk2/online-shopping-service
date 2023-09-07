package OnlineShopping.demo.serviceimpl;

import OnlineShopping.demo.dao.UsersDao;
import OnlineShopping.demo.model.Users;
import OnlineShopping.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;
    @Override
    public void addUsers(Users users) {
        usersDao.save(users);
    }
    @Transactional(readOnly = true)
    @Override
    public Users findUserByUsername(String username) {
        return usersDao.findUserByUsername(username);
    }
}
