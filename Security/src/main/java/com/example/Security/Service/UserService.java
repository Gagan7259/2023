package com.example.Security.Service;

import com.example.Security.Model.Role;
import com.example.Security.Model.User;

public interface UserService {

    User saveuser(User user);
    Role saveRole(Role role);
    void addToUser(String username, String rolename);
}
