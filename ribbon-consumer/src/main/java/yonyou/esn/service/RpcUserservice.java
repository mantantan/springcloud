package yonyou.esn.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import yonyou.esn.entity.User;

import java.util.UUID;


/**
 * Created by mantantan on 2018/2/6.
 */
@Service
public class RpcUserservice {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback") // 加入熔断器测试
    public User getUserById(String id) {
        ResponseEntity<User> responseEntity = restTemplate.getForEntity("http://EUREKA-CLIENT/user/get?id={}", User.class, "test");
        User user = responseEntity.getBody();
        return user;
    }

    // 熔断器回调函数
    public User fallback(String id) {
        User user = new User();
        user.setGender("man");
        user.setId(UUID.randomUUID().toString());
        user.setName("Hystrix");
        return user;
    }
}
