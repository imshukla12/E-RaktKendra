package com.example.eraktkendra.Service.ServiceImpl;

import com.example.eraktkendra.Entity.User;
import com.example.eraktkendra.Repository.UserRepository;
import com.example.eraktkendra.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) {
//        if(user.getCredit()!=0)
            return userRepository.save(user);
//        else{
//            user.setCredit(Long.valueOf(0));
//            return userRepository.save(user);
//        }
    }
}
