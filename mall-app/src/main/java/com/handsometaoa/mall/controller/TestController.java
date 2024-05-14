package com.handsometaoa.mall.controller;

import com.handsometaoa.sms.dto.SmsSendResponse;
import com.handsometaoa.sms.service.SmsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: handsometaoa
 * @description
 * @date: 2024/5/14 11:52
 */


@RestController
public class TestController {

    @Resource
    private SmsService smsService;

    @RequestMapping("/test")
    public SmsSendResponse test() {
        return smsService.sendSms("150xxxxxxxx", "sms content ... ");
    }


}
