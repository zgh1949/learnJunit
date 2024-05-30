package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getAddress(String username) {
        if ("Tom".equals(username)) {
            return "American";
        } else {
            return "China";
        }
    }
}
