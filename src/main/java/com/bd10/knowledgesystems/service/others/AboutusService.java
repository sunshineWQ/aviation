package com.bd10.knowledgesystems.service.others;

import com.bd10.knowledgesystems.model.dto.Abouts;
/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.others
 * @date 2020/2/16 11:04 星期日
 */

public interface AboutusService {
    Abouts queryAbouts();
    boolean  upateAbouts(String aboutus_content);



}
