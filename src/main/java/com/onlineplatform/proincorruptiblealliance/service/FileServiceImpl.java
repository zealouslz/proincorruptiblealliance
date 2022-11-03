package com.onlineplatform.proincorruptiblealliance.service;

import com.onlineplatform.proincorruptiblealliance.entity.File;
import com.onlineplatform.proincorruptiblealliance.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther liuze
 * @Date 2022/10/29
 */
@Service
public class FileServiceImpl implements FileService{
    @Autowired
    FileMapper fileMapper;
    @Override
    public int addNewFile(File file) {
        int i = fileMapper.addNewFile(file);
        return i;
    }

    @Override
    public int deleteByItemId(String itemId) {
        int i = fileMapper.deleteByItemId(itemId);
        return i;
    }

}
