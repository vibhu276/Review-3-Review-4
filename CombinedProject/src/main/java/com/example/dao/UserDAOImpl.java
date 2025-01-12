package com.example.dao;

import com.example.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserDAOTest {
    @Test
    void testSaveUser() {
        UserDAO userDAO = new UserDAOImpl();
        User user = new User(1, "Alice");

        assertTrue(userDAO.saveUser(user));
        assertEquals(1, userDAO.getAllUsers().size());
        assertNotNull(userDAO.getUserById(1));
    }
}
