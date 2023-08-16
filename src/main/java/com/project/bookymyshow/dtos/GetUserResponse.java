package com.project.bookymyshow.dtos;

import com.project.bookymyshow.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetUserResponse
{
    private Long id;

    private String email;

    private String name;





    public static GetUserResponse fromUser(User user)
    {
        return  new GetUserResponse(user.getId(), user.getName(),user.getEmail());
    }
}
