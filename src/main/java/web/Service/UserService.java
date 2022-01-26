package web.Service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getUserById(long id);
    void addUser(User user);
    void remove(long id);
    void update(User user);
}