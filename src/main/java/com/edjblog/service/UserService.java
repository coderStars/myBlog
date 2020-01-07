package com.edjblog;

import com.edjblog.pojo.User;

public interface UserService {

    User checkUser(String username, String password);
}
