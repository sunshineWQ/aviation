package com.bd10.knowledgesystems.dao.others;

import com.bd10.knowledgesystems.model.dto.SmtpEmail;

/**
 * @author 王青
 * @version V1.0
 * @Project: 邮箱smtp设置
 * @Package com.bd10.knowledgesystems.model.dto
 * @date 2020/2/16 14:40 星期日
 */
public interface SmtpEmailDao {
   SmtpEmail querySmtpEmail();
   int  updataSmtp(SmtpEmail smtpEmail);
}
