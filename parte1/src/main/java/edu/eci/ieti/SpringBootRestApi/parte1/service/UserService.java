package edu.eci.ieti.SpringBootRestApi.parte1.service;


import edu.eci.ieti.SpringBootRestApi.parte1.data.User;

import java.util.List;

public interface UserService {

        User create(User user );

        User findById( String id );

        List<User> all();

        User deleteById(String id );

        User update( User user, String userId );
}
