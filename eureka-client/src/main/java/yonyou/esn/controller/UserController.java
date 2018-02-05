package yonyou.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yonyou.esn.api.UserService;
import yonyou.esn.entity.User;

/**
 * Created by mantantan on 2018/2/4.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("get")
    public User getUserById(@RequestParam String id){
        return userService.getById(id);
    }
}
