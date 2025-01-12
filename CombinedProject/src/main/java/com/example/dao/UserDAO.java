package com.example.dao;

import com.example.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private final List<User> users = new ArrayList<>();

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    @Override
    public User getUserById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    @Override
    public boolean saveUser(User user) {
        return users.add(user);
    }
}
