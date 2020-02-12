package com.julio.malaika2.daos;

import com.julio.malaika2.models.User;

public interface IUsersDAO {
    boolean save(User user) throws Exception;
}
