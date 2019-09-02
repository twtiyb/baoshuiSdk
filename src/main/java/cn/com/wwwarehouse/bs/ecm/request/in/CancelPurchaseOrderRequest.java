package cn.com.wwwarehouse.bs.ecm.request.in;

import cn.com.wwwarehouse.bs.ecm.request.AbstractRequest;

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
