package com.julio.malaika2.services;

import com.julio.malaika2.daos.IUsersDAO;
import com.julio.malaika2.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements IUsersService {
    @Autowired
    IUsersDAO usersDAO;

    @Override
    public boolean save(User user) throws Exception {
        usersDAO.save(user);
        return false;
    }
}
