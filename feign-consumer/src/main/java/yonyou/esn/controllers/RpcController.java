package yonyou.esn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yonyou.esn.entity.User;
import yonyou.esn.service.RpcUserService;

/**
 * Created by mantantan on 2018/3/15.
 */

@RestController
@RequestMapping("/rpc")
public class RpcController {

    @Autowired
    private RpcUserService rpcUserService;

    @GetMapping("/user")
    public User getUserById(@RequestParam("id") String id) {
        User user = rpcUserService.getUserById(id);
        return user;
    }
}
