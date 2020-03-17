package com.bd10.knowledgesystems.dao.others;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.dao.others
 * @date 2020/2/16 23:15 星期日
 */
public interface NoteDao {

    String  queryNote();

    int  updataApiKey(String api_key);
}
