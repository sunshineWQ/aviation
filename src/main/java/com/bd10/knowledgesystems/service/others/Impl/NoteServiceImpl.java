package com.bd10.knowledgesystems.service.others.Impl;

import com.bd10.knowledgesystems.dao.others.NoteDao;
import com.bd10.knowledgesystems.service.others.NoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.dao.others
 * @date 2020/2/16 23:15 星期日
 */
@Service
public class NoteServiceImpl implements NoteService {

    @Resource
    private NoteDao noteDao;

    @Override
    public String queryNote() {
        return noteDao.queryNote();
    }

    @Override
    public boolean updataApiKey(String api_key) {
        if(noteDao.updataApiKey(api_key)>0){
            return   true;
        }
        return false;
    }
}
