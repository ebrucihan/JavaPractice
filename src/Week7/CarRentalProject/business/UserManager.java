package Week7.CarRentalProject.business;

import Week7.CarRentalProject.dao.UserDao;
import Week7.CarRentalProject.entity.User;

public class UserManager {
    private final UserDao userDao;


    public UserManager() {
        this.userDao = new UserDao();
    }

    public User findByLogin(String username, String password){
        return this.userDao.findByLogin(username,password);


    }
}
