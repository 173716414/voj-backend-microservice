package com.victor.vojbackenduserservice.controller.inner;

import com.victor.vojbackendmodel.model.entity.User;
import com.victor.vojbackendserviceclient.service.UserFeignClient;
import com.victor.vojbackenduserservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/*
 *Author：Victor_htq
 *Package：com.victor.vojbackenduserservice.controller.inner
 *Project：voj-backend-microservice
 *name：UserInnerController
 *Date：2024/5/28  15:03
 *Filename：UserInnerController
 */
@RestController()
@RequestMapping("/inner")
public class UserInnerController implements UserFeignClient {

    @Resource
    private UserService userService;

    /**
     * 根据id获取用户
     * @param userId
     * @return
     */
    @Override
    @GetMapping("/get/id")
    public User getById(@RequestParam("userId") long userId) {
        return userService.getById(userId);
    }

    /**
     * 根据id获取用户列表
     * @param idList
     * @return
     */
    @GetMapping("/get/ids")
    public List<User> listByIds(@RequestParam("idList") Collection<Long> idList) {
        return userService.listByIds(idList);
    }
}
