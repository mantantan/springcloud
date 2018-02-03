package yonyou.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mantantan on 2018/2/2.
 */
@RestController
public class TestController {

    @RequestMapping("/test")

    public String test(){
        return "200ok";
    }
}
