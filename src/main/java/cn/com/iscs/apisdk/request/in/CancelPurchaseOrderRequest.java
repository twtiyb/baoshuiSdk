package cn.com.iscs.apisdk.request.in;

import cn.com.iscs.apisdk.request.AbstractRequest;

public class CancelPurchaseOrderRequest extends AbstractRequest {
	public String orderCode;

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	@Override
	public String getMethod() {
		return "CANCEL_PURCHASE_ORDER";
	}

}
