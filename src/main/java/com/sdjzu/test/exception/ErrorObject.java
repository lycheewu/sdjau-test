package com.sdjzu.test.exception;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * @author wangqimen
 * @date 2019/06/25
 */
@Data
public class ErrorObject {

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误描述
     */
    private String msg;

    public ErrorObject() {
    }

    public ErrorObject(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ErrorObject(ErrorObject errorObject) {
        this.code = errorObject.code;
        this.msg = errorObject.msg;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
