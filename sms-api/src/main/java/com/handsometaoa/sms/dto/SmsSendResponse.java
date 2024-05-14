package com.handsometaoa.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: handsometaoa
 * @description
 * @date: 2024/5/14 11:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsSendResponse implements Serializable {

    private Integer code;
    private String message;
    private String data;

}
