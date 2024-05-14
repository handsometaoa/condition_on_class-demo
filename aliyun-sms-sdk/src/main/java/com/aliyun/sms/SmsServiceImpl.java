package com.aliyun.sms;

import com.handsometaoa.sms.dto.SmsSendResponse;
import com.handsometaoa.sms.service.SmsService;

/**
 * @author: handsometaoa
 * @description
 * @date: 2024/5/14 11:34
 */
public class SmsServiceImpl implements SmsService {

    @Override
    public SmsSendResponse sendSms(String mobile, String content) {
        return new SmsSendResponse(200, "阿里云发送短信成功", null);
    }

}
