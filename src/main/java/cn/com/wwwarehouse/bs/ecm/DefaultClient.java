package cn.com.wwwarehouse.bs.ecm;


import cn.com.wwwarehouse.bs.ecm.internal.parser.Parser;
import cn.com.wwwarehouse.bs.ecm.internal.parser.ParserFactory;
import cn.com.wwwarehouse.bs.ecm.request.AbstractRequest;
import cn.com.wwwarehouse.bs.ecm.util.AuthUtil;
import cn.com.wwwarehouse.bs.ecm.util.FileUtil;
import cn.com.wwwarehouse.bs.ecm.util.StringUtil;
import cn.com.wwwarehouse.bs.util.logHelper;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class DefaultClient {
	private int connectTimeout;
	private int readTimeout;
	private String serverUrl;
	private String format;
	private String storeCode;
	private String platformId;
	private String charset = "utf-8";
	private String key;

	public DefaultClient(String serverUrl, String storeCode, String sellerUserId, String platformId, String key, String format) {

	}

	public DefaultClient(String serverUrl, String storeCode, String platformId, String key, String format) {
		this.connectTimeout = 0;
		this.readTimeout = 0;
		this.serverUrl = serverUrl;
		this.format = format;
		this.storeCode = storeCode;
		this.platformId = platformId;
		this.key = key;
	}

	public DefaultClient(String serverUrl, String storeCode, String platformId, String key
			, String format, int connectTimeout, int readTimeout) {
		this(serverUrl, storeCode, platformId, key, format);
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	public Response execute(AbstractRequest request) throws IscsException {
		return null;
	}

	public Response execute(AbstractRequest request, String sellerUserId) throws IscsException {
		try {
			String data = null;
			if ("json".equals(this.format)) {
				data = ParserFactory.getJsonParser().writeValueAsString(request);
			} else if ("xml".equals(this.format)) {
			} else {
				throw new IscsException("未知的格式,只支持xml,json");
			}
			String v_timestamp = StringUtil.formatDate(new Date());

			Map<String, String> params = new HashMap<String, String>();
			params.put("data", data);
			params.put("sign", AuthUtil.sign(data + key));
			params.put("notify_type", request.getMethod());
			params.put("notify_time", v_timestamp);
			params.put("notify_id", AuthUtil.sign(params.get("sign") + v_timestamp));
			params.put("store_code", storeCode);
			params.put("seller_user_id", sellerUserId);
			params.put("format", format);
			params.put("charset", charset);
			params.put("platform_id", platformId);
			String rsp = FileUtil.doPost(serverUrl, params, this.charset);
			logHelper.logReAndRes(request.getMethod(), data, rsp);
			log.debug("编号requset body-->{},response body-->{}", data, rsp);
			return parse(rsp, Response.class);
		} catch (Exception e) {
			log.debug(e.getMessage());
			throw new IscsException(e);
		}
	}

	private Response parse(String rsp, Class responseClass) throws IscsException {
		Parser parser;
		if (format.equals("json")) {
			parser = ParserFactory.getJsonParser();
		} else {
			parser = ParserFactory.getXmlParser();
		}
		return parser.parse(rsp, responseClass);
	}
}
