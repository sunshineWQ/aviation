package com.bd10.knowledgesystems.dao.others;

import com.bd10.knowledgesystems.model.dto.FeedBack;
import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.dao.others
 * @date 2020/2/15 17:50 星期六
 */
public interface FeedBackDao {
    List<FeedBack>queryAllFeedBack();

    //删除反馈
    int  delFeedBack(int feedback_id);
    //根据id  cha查询具体的咨询内容
    String  queryContentById(int feedback_id);
}
