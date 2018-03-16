package yonyou.esn.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import yonyou.esn.entity.User;

/**
 * Created by mantantan on 2018/3/15.
 */
@Component
public class RpcUserServiceFallBack implements RpcUserService {

    @Override
    public User getUserById(@RequestParam("id") String id) {
        User defaultUser = new User();
        defaultUser.setId("0");
        defaultUser.setName("defaultName");
        defaultUser.setGender("男");
        return defaultUser;
    }
}
