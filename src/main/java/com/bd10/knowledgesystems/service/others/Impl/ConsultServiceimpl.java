package com.bd10.knowledgesystems.service.others.Impl;

import com.bd10.knowledgesystems.dao.others.ConsultDao;
import com.bd10.knowledgesystems.model.entity.consult;
import com.bd10.knowledgesystems.service.others.ConsultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.others.Impl
 * @date 2020/2/14 22:22 星期五
 */
@Service
public class ConsultServiceimpl  implements ConsultService {

       @Resource
    private ConsultDao consultDao;
    @Override
    public boolean delConsult(int consult_id) {
        if(consultDao.delConsult(consult_id)>0){
         return  true;
        }
        return false;
    }

    @Override
    public String queryCSContent(int consult_id) {
        return consultDao.queryCSContent(consult_id);
    }

    @Override
    public boolean addConsult(consult consult) {
        if(consultDao.addConsult(consult)>0){
          return   true;
        }
        return false;
    }
}
