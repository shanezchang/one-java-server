package org.onejavaserver.api;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shanechang
 */
@Data
@AllArgsConstructor
public class CommonResponse<T> {

    private long code;

    private String message;

    private T data;

    public static <T> CommonResponse<T> success(T data) {
        return new CommonResponse<>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResponse<T> success() {
        return success(null);
    }

    public static <T> CommonResponse<T> failed(long code, String message, T data) {
        return new CommonResponse<>(code, message, data);
    }

    public static <T> CommonResponse<T> failed(long code, String message) {
        return failed(code, message, null);
    }

    public static <T> CommonResponse<T> failed(String message) {
        return failed(ResponseEnum.FAILED.getCode(), message);
    }

    public static <T> CommonResponse<T> failed() {
        return failed(ResponseEnum.FAILED.getMessage());
    }
}
