package yonyou.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mantantan on 2018/2/3.
 */
@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String test(){
        return restTemplate.getForEntity("http://EUREKA-CLIENT/test", String.class).getBody();
    }
}
