package com.emirsanchez.usersmanage.resource;

import com.emirsanchez.usersmanage.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {

    @GetMapping("/home")
    public String showUser() {

        return "Works!";

    }

}
