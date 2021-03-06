package cn.com.wwwarehouse.bs.ecm.request.base;

import cn.com.wwwarehouse.bs.ecm.request.AbstractRequest;
import lombok.Data;

@Data
public class SubscriptionNotifyRequest extends AbstractRequest {
	String sellerUserId;
	String storeCode;
	String sellerName;
	String sellerNick;
	String sellerMobile;
	String sellerPhone;
	String sellerEmail;
	String sellerAddress;
	String actionType;
	String content;
	String remark;

	public String getMethod() {
		return "WMS_SUBSCRIPTION_NOTIFY";
	}
}