package com.onlineplatform.proincorruptiblealliance.controller;

import com.onlineplatform.proincorruptiblealliance.core.Result;
import com.onlineplatform.proincorruptiblealliance.dto.LoginForm;
import com.onlineplatform.proincorruptiblealliance.entity.UserInfo;
import com.onlineplatform.proincorruptiblealliance.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther liuze
 * @Date 2022/10/27
 */
@RestController
@RequestMapping("user")
@Controller
@Api(value = "用户接口", tags = {"用户接口"})
public class UserController {
    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation("用户登陆")
    @PostMapping("userLogin")
    public Result<UserInfo> userLogin(@RequestBody LoginForm loginForm){
        String userName = loginForm.getUserName();
        String password = loginForm.getPassword();
        List<UserInfo> userInfo = userInfoService.selectByUserName(userName);
        if (userInfo.size()==0){
           return Result.error("用户不存在！");
        }else {
            if (userInfo.get(0).getPassword().equals(password)){
                return Result.ok();
            }else {
                return Result.error("密码错误！");
            }
        }


    }
}
