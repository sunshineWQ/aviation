package com.bd10.knowledgesystems.service.others;

import com.bd10.knowledgesystems.model.entity.WebSeting;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.others
 * @date 2020/2/15 09:15 星期六
 */
public interface WebSetService {
    WebSeting  queryWebSeting();
    boolean  updateWeb(WebSeting webSeting);
}
