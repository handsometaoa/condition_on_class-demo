package com.handsometaoa.sms.service;

import com.handsometaoa.sms.dto.SmsSendResponse;

public interface SmsService {
    SmsSendResponse sendSms(String mobile, String content);
}
