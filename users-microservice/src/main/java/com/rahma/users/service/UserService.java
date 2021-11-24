package com.rahma.users.service;

import com.rahma.users.entities.Role;
import com.rahma.users.entities.User;
public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}