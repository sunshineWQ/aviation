package com.bd10.knowledgesystems.dao.others;

import com.bd10.knowledgesystems.model.dto.Abouts;


/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.dao.others
 * @date 2020/2/16 11:01 星期日
 */
public interface AboutusDao {
    Abouts queryAbouts();

    int  upateAbouts(String aboutus_content);
}
