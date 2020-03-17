package com.bd10.knowledgesystems.service.others.Impl;

import com.bd10.knowledgesystems.dao.others.SmtpEmailDao;
import com.bd10.knowledgesystems.model.dto.SmtpEmail;
import com.bd10.knowledgesystems.service.others.SmtpEmailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王青
 * @version V1.0
 * @Project: 邮箱smtp设置
 * @Package com.bd10.knowledgesystems.model.dto
 * @date 2020/2/16 14:40 星期日
 */
@Service
public class SmtpEmaiServiceImpl implements SmtpEmailService{

   @Resource
   private SmtpEmailDao  smtpEmailDao;
   @Override
   public SmtpEmail querySmtpEmail() {

      return smtpEmailDao.querySmtpEmail();
   }

   @Override
   public boolean updataSmtp(SmtpEmail smtpEmail) {
      if(smtpEmailDao.updataSmtp(smtpEmail)>0){
               return  true;
      }
      return false;
   }
}
