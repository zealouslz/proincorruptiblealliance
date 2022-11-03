package com.onlineplatform.proincorruptiblealliance.service;

import com.onlineplatform.proincorruptiblealliance.entity.UserInfo;

import javax.swing.*;
import java.util.List;

/**
 * @Auther liuze
 * @Date 2022/10/27
 */
public interface UserInfoService {
    List<UserInfo> selectByUserName(String username);
}
