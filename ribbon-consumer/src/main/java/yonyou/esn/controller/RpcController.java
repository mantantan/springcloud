package yonyou.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import yonyou.esn.entity.User;
import yonyou.esn.service.RpcUserservice;

/**
 * Created by mantantan on 2018/2/4.
 */
@RestController
@RequestMapping("/rpc")
public class RpcController {

    @Autowired
    private RpcUserservice rpcUserservice;

    @GetMapping("/user")
    public User getUserById(@RequestParam String id){
        return rpcUserservice.getUserById(id);
    }
}
