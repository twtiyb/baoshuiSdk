package cn.com.wwwarehouse.bs.swt.request;

import cn.com.wwwarehouse.bs.swt.SwtAbstractRequest;
import cn.com.wwwarehouse.bs.swt.response.IdentifyCheckResponse;
import lombok.Data;

/**
 * 创建者: xuchun
 * 创建时间: 2019-07-22 13:27
 * 说明:
 **/
@Data
public class IdentifyCheckRequest extends SwtAbstractRequest {
	String ver;
	String name;
	String cid;
	String orderNo;
	String type = "1";


	@Override
	public String getMethod() {
		return "/swt-ams/authentication/identify";
	}

	@Override
	public Class getResponse() {
		return IdentifyCheckResponse.class;
	}
}
