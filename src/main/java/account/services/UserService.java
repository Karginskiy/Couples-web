package account.services;

import account.model.User;

public interface UserService {
    User findByUsername(String username);
    void save(User user);
}
