package com.high.baegopa.enums;

/**
 * Created by high on 2017. 7. 2..
 */
public enum MessageCode {
    SUCCESS(1),
    ALREADY_FRIENDS(101),
    INVALID_USER(-101),
    NOT_PLUS_FRIEND(-102),
    INVALID_PARAMS(-109),
    FAIL(-1);

    private final Integer code;

    MessageCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}