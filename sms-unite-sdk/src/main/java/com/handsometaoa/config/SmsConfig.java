package com.handsometaoa.config;

import com.handsometaoa.sms.service.SmsService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: handsometaoa
 * @description
 * @date: 2024/5/14 11:45
 */

@Configuration
public class SmsConfig {

    @Bean
    @ConditionalOnClass(name = "com.aliyun.sms.SmsServiceImpl")
    public SmsService ailiyunSmsService() {
        System.out.println("aliyun smsService init");
        return new com.aliyun.sms.SmsServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean(SmsService.class)
    @ConditionalOnClass(name = "com.tencent.sms.SmsServiceImpl")
    public SmsService tencentSmsService() {
        System.out.println("tx smsService init");
        return new com.tencent.sms.SmsServiceImpl();
    }

}
