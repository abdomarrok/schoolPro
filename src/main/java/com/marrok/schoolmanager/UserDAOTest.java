package com.marrok.schoolmanager;

import com.marrok.schoolmanager.dao.UserDAO;
import com.marrok.schoolmanager.model.User;

import java.util.List;

public class UserDAOTest {

    private static UserDAO userDAO = new UserDAO();

    public static void addUser() {
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");
        user.setRole("admin");

        userDAO.save(user);
        System.out.println("User added: " + user);
    }


}
