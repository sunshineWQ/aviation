package com.bd10.knowledgesystems.service.others.Impl;

import com.bd10.knowledgesystems.dao.others.FeedBackDao;
import com.bd10.knowledgesystems.model.dto.FeedBack;
import com.bd10.knowledgesystems.service.others.FeedBackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.others.Impl
 * @date 2020/2/15 17:51 星期六
 */
@Service
public class FeedBackServiceImpl  implements FeedBackService {
  @Resource
   private FeedBackDao feedBackDao;
    @Override
    public List<FeedBack> queryAllFeedBack() {
        return feedBackDao.queryAllFeedBack();
    }

    @Override
    public boolean delFeedBack(int feedback_id) {
        if(feedBackDao.delFeedBack(feedback_id)>0){
        return   true;
        }
        return false;
    }

    @Override
    public String queryContentById(int feedback_id) {
        return feedBackDao.queryContentById(feedback_id);
    }

}
