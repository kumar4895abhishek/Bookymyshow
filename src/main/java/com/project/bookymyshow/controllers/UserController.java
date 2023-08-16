package com.project.bookymyshow.controllers;

import com.project.bookymyshow.dtos.CreateUserRequest;
import com.project.bookymyshow.dtos.GetUserResponse;
import com.project.bookymyshow.models.User;
import com.project.bookymyshow.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor // 2 way 1 autowire and another constructor
//@RequestMapping("/api/v1")
public class UserController
{
 // @Autowired  // Autowire is field inj not recommended because it mutates the obj safe way constr
  public UserService userService;
  //  @RequestMapping(path="/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public GetUserResponse createUser(@RequestBody CreateUserRequest createUserRequest)
    {
      System.out.println("EMAIL ID "+createUserRequest.getEmail()+ " PASSWORD "+createUserRequest.getPassword());
      User user=userService.createUser(createUserRequest.toUser());

      return  GetUserResponse.fromUser(user);
    }
}
