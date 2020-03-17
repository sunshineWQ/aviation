package com.bd10.knowledgesystems.service.others;

import com.bd10.knowledgesystems.model.entity.consult;
/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.others
 * @date 2020/2/14 22:22 星期五
 */
public interface ConsultService {
    boolean  delConsult(int consult_id);
    String queryCSContent(int consult_id);
    boolean  addConsult(consult consult);
}
