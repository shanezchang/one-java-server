package org.onejavaserver.exception;

import lombok.Getter;
import org.onejavaserver.api.ResponseEnum;

/**
 * @author shanechang
 */
@Getter
public class ApiException extends RuntimeException {

    private long code;

    private Object data;

    public ApiException(long code, String message, Object data) {
        super(message);
        this.code = code;
        this.data = data;
    }

    public ApiException(String message) {
        super(message);
        this.code = ResponseEnum.FAILED.getCode();
    }

    public ApiException() {
        super(ResponseEnum.FAILED.getMessage());
        this.code = ResponseEnum.FAILED.getCode();
    }
}
