package com.bd10.knowledgesystems.dao.others;

import com.bd10.knowledgesystems.model.entity.consult;

/**
 * @author 王青
 * @version V1.0
 * @Project: 咨询内容
 * @Package com.bd10.knowledgesystems.dao.others
 * @date 2020/2/14 22:18 星期五
 */
public interface ConsultDao {
    //删除咨询表的  主键  id  删除
    int  delConsult(int consult_id);
    //根据id  查询咨询内容
    String queryCSContent(int consult_id);

    //客户端添加咨询
    int  addConsult(consult consult);

}
