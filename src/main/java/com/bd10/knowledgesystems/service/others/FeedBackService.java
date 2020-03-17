package com.bd10.knowledgesystems.service.others;

import com.bd10.knowledgesystems.model.dto.FeedBack;

import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.others
 * @date 2020/2/15 17:51 星期六
 */
public interface FeedBackService {
    List<FeedBack> queryAllFeedBack();
    boolean delFeedBack(int feedback_id);
    String  queryContentById(int feedback_id);
}
