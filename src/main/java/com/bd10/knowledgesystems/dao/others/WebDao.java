package com.bd10.knowledgesystems.dao.others;

import com.bd10.knowledgesystems.model.entity.WebSeting;


/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.dao.others
 * @date 2020/2/15 09:02 星期六
 */
public interface WebDao {

    WebSeting queryWebSeting();
    //更新  设置  网站的信息
    int  updateWeb(WebSeting webSeting);
}
