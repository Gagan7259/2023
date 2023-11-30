package com.example.Security2.Service;

import com.example.Security2.Model.Role;
import com.example.Security2.Model.User;

public interface UserService {
    User saveuser(User user);
    Role saveRole(Role  role);
    void  AddtoUser(String username, String rolename);
}
