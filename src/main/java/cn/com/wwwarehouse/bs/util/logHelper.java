package cn.com.wwwarehouse.bs.util;

import cn.hutool.core.map.MapUtil;
import cn.hutool.json.JSONUtil;

import java.util.Map;

/**
 * 创建者: xuchun
 * 创建时间: 2019-09-02 15:19
 * 说明:
 **/
public class logHelper {
    public static String logReAndRes(String method, String req, String res) {
        Map map = MapUtil.builder()
                .put("method", method)
                .put("req", req)
                .put("res", res).build();
        return JSONUtil.toJsonStr(map);
    }
}
