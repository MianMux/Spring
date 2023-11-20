package demo.service;

import demo.dao.UserDao;
import demo.pojo.User;

public class UserServiceImpl implements UserService{
    // 这个类需要依赖UserDaoImpl对象
    private UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Boolean login(String username, String password) {
        User user = userDao.findUserByNameAndPassword(username,password);
        if(user!= null){
            return true;
        }
        return false;
    }
}
