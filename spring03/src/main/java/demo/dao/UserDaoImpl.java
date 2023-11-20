package demo.dao;

import demo.pojo.User;

public class UserDaoImpl implements UserDao{
    @Override
    public User findUserByNameAndPassword(String username, String password) {
        // to create SqlSession Object and invoke the method named selectOne() to invoke the SQL which
        // located in mapper.xml
        // User user = sqlSession.selectOne("sqlId","params");
        User user = new User();
        user.setId(1);
        user.setUsername("zhangsan");
        user.setPassword("1234");
        return user;
    }
}
