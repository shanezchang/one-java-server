package org.onejavaserver.api;

import lombok.Getter;

/**
 * @author shanechang
 */

@Getter
public enum ResponseEnum {

    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败");

    private final long code;

    private final String message;

    ResponseEnum(long code,String message) {
        this.code = code;
        this.message = message;
    }
}
