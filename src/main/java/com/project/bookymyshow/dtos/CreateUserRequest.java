package com.project.bookymyshow.dtos;


import com.project.bookymyshow.models.User;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class CreateUserRequest
{
    //@NotNull
    private String email;

    private String name;

    private String password;

    public User toUser()
    {
        return new User(name,email,password);
    }
}
