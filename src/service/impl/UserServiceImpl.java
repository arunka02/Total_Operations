package service.impl;

import service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean authenticateUser(String userName, String password) {
        if(userName.equalsIgnoreCase("Admin") && password.equals("admin123")) {
            return true;
        } else {
            return false;
        }
    }
}
