package OnlineShopping.demo.service;

import OnlineShopping.demo.model.Users;

public interface UsersService {
    public void addUsers(Users users);

    Users findUserByUsername(String username);
}
