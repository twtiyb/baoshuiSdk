package cn.com.wwwarehouse.bs.ecm.util;

import cn.com.wwwarehouse.bs.ecm.Response;

/**
 * 创建者: xuchun
 * 创建时间: 2019-08-22 15:28
 * 说明:
 **/
public class ResponseUtil {
    public static Response ok() {
        Response response = new Response();
        response.setSuccess("true");
        return response;
    }

    public static Response faild(String errCode, String errMsg) {
        Response response = new Response();
        response.setSuccess("false");
        response.setErrorCode(errCode);
        response.setErrorMsg(errMsg);
        return response;
    }
}
