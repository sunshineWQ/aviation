package com.bd10.knowledgesystems.service.others.Impl;

import com.bd10.knowledgesystems.dao.others.WebDao;
import com.bd10.knowledgesystems.model.entity.WebSeting;
import com.bd10.knowledgesystems.service.others.WebSetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.others.Impl
 * @date 2020/2/15 09:15 星期六
 */
@Service
public class WebSetServiceImpl  implements WebSetService {

    @Resource
    private WebDao  webDao;

    @Override
    public WebSeting queryWebSeting() {
        return webDao.queryWebSeting();
    }

    @Override
    public boolean updateWeb(WebSeting webSeting) {
        if(webDao.updateWeb(webSeting)>0){
           return true;
        }
        return false;
    }
}
