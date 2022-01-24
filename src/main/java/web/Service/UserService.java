package web.Service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getUser(long id);
    void addUser(User user);
    void remove(long id);
    void update(long id, User user);
}