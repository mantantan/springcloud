package yonyou.esn.service;

import org.springframework.stereotype.Service;
import yonyou.esn.api.UserService;
import yonyou.esn.entity.User;

import java.util.UUID;

/**
 * Created by mantantan on 2018/2/4.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getById(String id) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("mantantan");
        user.setGender("man");
        return user;
    }
}
