package com.onlineplatform.proincorruptiblealliance.service;

import com.onlineplatform.proincorruptiblealliance.entity.File;

/**
 * @Auther liuze
 * @Date 2022/10/29
 */
public interface FileService {
    int addNewFile(File file);
    int deleteByItemId(String itemId);

}
