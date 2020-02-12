package com.julio.malaika2.daos;

import com.julio.malaika2.models.User;
import com.julio.malaika2.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsersDAO implements IUsersDAO {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public boolean save(User user) throws Exception {
        usersRepository.save(user);
        return true;
    }
}
