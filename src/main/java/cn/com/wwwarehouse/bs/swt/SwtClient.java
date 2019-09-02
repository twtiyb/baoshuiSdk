package cn.com.wwwarehouse.bs.swt;


import cn.com.wwwarehouse.bs.ecm.IscsException;
import cn.com.wwwarehouse.bs.ecm.internal.parser.ParserFactory;
import cn.com.wwwarehouse.bs.ecm.util.AuthUtil;
import cn.com.wwwarehouse.bs.util.logHelper;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class SwtClient {
    private String baseUrl;
    private String mchtId;
    private String key;

    public SwtClient(String baseUrl, String mchtId, String key) {
        this.baseUrl = baseUrl;
        this.mchtId = mchtId;
        this.key = key;
    }

    public static String getSign(Map param, String key) {
        String paramStr = (String) param.keySet().stream()
                .filter(k -> param.get(k) != null)
                .sorted()
                .map(k -> {
                    return k + "=" + param.get(k);
                })
                .collect(Collectors.joining("&"));
        paramStr = paramStr + "&" + "key=" + key;

        log.debug("signParm---> {}", paramStr);
        String sign = AuthUtil.getMD5(paramStr);
        log.debug("sign---> {}", sign);
        return sign;
    }

    public SwtResponse execute(SwtAbstractRequest request) throws IscsException {
        try {
            Map<String, String> params = new HashMap<String, String>();
            params.put("mchtId", this.mchtId);
            params.put("token", RandomUtil.randomString(32));
            params.putAll(ParserFactory.getJsonParser().writeVaueAsMap(request));
            params.put("sign", getSign(params, this.key));

            String jsonParam = JSONUtil.toJsonStr(params);

            String rsp = HttpUtil.post(this.baseUrl + request.getMethod(), jsonParam);
            logHelper.logReAndRes(request.getMethod(), jsonParam, rsp);
            return (SwtResponse) JSONUtil.toBean(rsp, request.getResponse());
        } catch (Exception e) {
            log.debug(e.getMessage());
            throw new IscsException(e);
        }
    }
}
