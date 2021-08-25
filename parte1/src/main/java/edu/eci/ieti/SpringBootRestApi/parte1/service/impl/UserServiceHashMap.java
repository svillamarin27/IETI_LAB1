package edu.eci.ieti.SpringBootRestApi.parte1.service.impl;

import edu.eci.ieti.SpringBootRestApi.parte1.data.User;
import edu.eci.ieti.SpringBootRestApi.parte1.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService {
    private final HashMap<String,User> usersHash = new HashMap<>();

    @Override
    public User create(User user) {
        return this.usersHash.put(user.getId(),user);
    }

    @Override
    public User findById(String id) {
        User user = usersHash.get(id);
        return user;
    }

    @Override
    public List<User> all() {
        return new ArrayList<User> (usersHash.values());
    }

    @Override
    public User deleteById(String id){
        return usersHash.remove(id);
    }

    @Override
    public User update(User user, String userId) {
        return usersHash.put(userId,user);
    }
}
