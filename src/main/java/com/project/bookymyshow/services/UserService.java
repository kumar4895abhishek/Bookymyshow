package com.project.bookymyshow.services;

import com.project.bookymyshow.models.User;
import com.project.bookymyshow.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.theme.CookieThemeResolver;


@Service
@AllArgsConstructor
public class UserService
{

    public UserRepository userRepository;
    public User createUser(User user)
    {

        System.out.println("USERNAME SERVICE  "+user.getName()+"EMAIL ID "+user.getEmail()+ " PASSWORD "+user.getPassword());
        //User savedUser=userRepository.save(user);
        return userRepository.save(user);

    }

    public User getUser(Long userId)
    {

        return userRepository.findById(userId).orElse(null);

    }
}
