package demo.dao;

import demo.pojo.User;

public interface UserDao {
    User findUserByNameAndPassword(String username, String password);
}
