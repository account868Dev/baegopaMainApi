package com.high.baegopa.models.response;

import lombok.Data;

/**
 * Created by high on 2017. 7. 2..
 */
@Data
public class CommonResponse {

    private CommonResponse commonResponse;

    public static CommonResponse getInstance(){
        return new CommonResponse();
    }

    private String result;
    private String reason;

    public CommonResponse fail(String msg){
        this.result = "fail";
        this.reason = msg;
        return this.commonResponse;
    }

    public CommonResponse success(){
        this.result = "success";
        return this.commonResponse;
    }

    public CommonResponse success(String msg){
        this.result = "success";
        this.reason = msg;
        return this.commonResponse;
    }
}
