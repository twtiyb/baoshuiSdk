package cn.com.iscs.apisdk;


import cn.com.iscs.apisdk.internal.parser.Parser;
import cn.com.iscs.apisdk.internal.parser.ParserFactory;
import cn.com.iscs.apisdk.request.AbstractRequest;
import cn.com.iscs.apisdk.util.AuthUtil;
import cn.com.iscs.apisdk.util.FileUtil;
import cn.com.iscs.apisdk.util.StringUtil;
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
	private String serverUserId;
	private String storeCode;
	private String platformId;
	private String charset = "utf-8";
	private String key;

	public DefaultClient(String serverUrl, String serverUserId, String storeCode, String platformId, String key, String format) {
		this.connectTimeout = 0;
		this.readTimeout = 0;
		this.serverUrl = serverUrl;
		this.format = format;
		this.serverUserId = serverUserId;
		this.storeCode = storeCode;
		this.platformId = platformId;
		this.key = key;
	}

	public DefaultClient(String serverUrl, String serverUserId, String storeCode, String platformId, String key
			, String format, int connectTimeout, int readTimeout) {
		this(serverUrl, serverUserId, storeCode, platformId, key, format);
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	public Response execute(AbstractRequest request) throws IscsException {
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
			params.put("seller_user_id", serverUserId);
			params.put("format", format);
			params.put("charset", charset);
			params.put("platform_id", platformId);
			log.debug(data);
			String rsp = FileUtil.doPost(serverUrl, params, this.charset);
			log.debug(rsp);
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
