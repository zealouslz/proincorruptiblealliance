package com.onlineplatform.proincorruptiblealliance.service;

import com.onlineplatform.proincorruptiblealliance.dto.ModularAndType;
import com.onlineplatform.proincorruptiblealliance.entity.LianmengType;
import com.onlineplatform.proincorruptiblealliance.entity.LianmengTypeExample;
import com.onlineplatform.proincorruptiblealliance.entity.ModularDict;
import com.onlineplatform.proincorruptiblealliance.mapper.LianmengTypeMapper;
import com.onlineplatform.proincorruptiblealliance.mapper.ModularDictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther liuze
 * @Date 2022/10/28
 */
@Service
public class ModularAndTypeServiceImpl  implements ModularAndTypeService{
    @Autowired
    ModularDictMapper modularDictMapper;
    @Autowired
    LianmengTypeMapper lianmengTypeMapper;
    @Override
    public List<ModularAndType> getModularAndType() {
        List<ModularAndType> modularAndTypes=new ArrayList<>();
        List<ModularDict> modularDicts = modularDictMapper.selectAll();
        for ( ModularDict modularDict:modularDicts) {
            ModularAndType modularAndType = new ModularAndType();
            List<LianmengType> lianmengTypes = lianmengTypeMapper.selectByModularId(modularDict.getModularId());
            modularAndType.setLianmengTypes(lianmengTypes);
            modularAndType.setModularId(modularDict.getModularId());
            modularAndType.setModularName(modularDict.getModularName());
            modularAndTypes.add(modularAndType);
        }
        return modularAndTypes;
    }
}
