package com.selrain.lesson5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String name;

    public static String getUserName(User user){
        return user.getName();
    }
}
