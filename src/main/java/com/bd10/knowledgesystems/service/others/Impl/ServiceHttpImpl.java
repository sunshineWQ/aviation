package com.bd10.knowledgesystems.service.others.Impl;

import com.bd10.knowledgesystems.dao.others.ServiceHttpDao;
import com.bd10.knowledgesystems.service.others.ServiceHttpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.others.Impl
 * @date 2020/2/16 11:46 星期日
 */
@Service
public class ServiceHttpImpl  implements ServiceHttpService {
    @Resource
    private ServiceHttpDao  serviceHttpDao;
    @Override
    public String queryServiceContent() {
        return serviceHttpDao.queryServiceContent();
    }

    @Override
    public boolean updataSeerviceHttp(String service_agreement_content) {
        if(serviceHttpDao.updataSeerviceHttp(service_agreement_content)>0){
           return true;
        }
        return   false;
    }
}
