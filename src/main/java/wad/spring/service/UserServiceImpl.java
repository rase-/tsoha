/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wad.spring.domain.User;
import wad.spring.repository.UserRepository;

/**
 *
 * @author tonykovanen
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepo;
    
    @Override
    public User findUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }
    
}
