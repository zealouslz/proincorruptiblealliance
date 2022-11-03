package com.onlineplatform.proincorruptiblealliance.service;

import com.onlineplatform.proincorruptiblealliance.entity.UserInfo;
import com.onlineplatform.proincorruptiblealliance.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

/**
 * @Auther liuze
 * @Date 2022/10/27
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> selectByUserName(String username) {
        List<UserInfo> userInfo = userInfoMapper.selectByUserName(username);

        return userInfo;
    }
}
