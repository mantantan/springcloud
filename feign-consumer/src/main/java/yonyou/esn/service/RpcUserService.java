package yonyou.esn.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import yonyou.esn.entity.User;

/**
 * Created by mantantan on 2018/3/15.
 */
@FeignClient(name = "EUREKA-CLIENT", fallback = RpcUserServiceFallBack.class)
public interface RpcUserService {
    @RequestMapping(value = "/user/get", method = RequestMethod.GET)
    public User getUserById(@RequestParam("id") String id);
}
