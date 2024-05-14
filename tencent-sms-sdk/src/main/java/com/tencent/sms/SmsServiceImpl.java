package com.tencent.sms;

import com.handsometaoa.sms.dto.SmsSendResponse;
import com.handsometaoa.sms.service.SmsService;

/**
 * @author: handsometaoa
 * @description
 * @date: 2024/5/14 11:40
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public SmsSendResponse sendSms(String mobile, String content) {
        return new SmsSendResponse(200, "腾讯云发送短信成功", null);
    }
}