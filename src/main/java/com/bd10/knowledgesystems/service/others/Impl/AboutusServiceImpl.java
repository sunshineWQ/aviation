package com.bd10.knowledgesystems.service.others.Impl;
import com.bd10.knowledgesystems.dao.others.AboutusDao;
import com.bd10.knowledgesystems.model.dto.Abouts;
import com.bd10.knowledgesystems.service.others.AboutusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.others.Impl
 * @date 2020/2/16 11:04 星期日
 */
@Service
public class AboutusServiceImpl  implements AboutusService {

    @Resource
    private AboutusDao aboutusDao;
    @Override
    public Abouts queryAbouts() {
        return aboutusDao.queryAbouts();
    }

    @Override
    public boolean upateAbouts(String aboutus_content) {
        if(aboutusDao.upateAbouts(aboutus_content)>0){
         return   true;
        }
        return false;
    }
}
