package web.Dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User getUser(long id);
    void addUser(User user);
    void remove(long id);
    void update(long id, User user);
}