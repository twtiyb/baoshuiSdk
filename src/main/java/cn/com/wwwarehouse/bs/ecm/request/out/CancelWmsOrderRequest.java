package cn.com.wwwarehouse.bs.ecm.request.out;

import cn.com.wwwarehouse.bs.ecm.request.AbstractRequest;

public class CancelWmsOrderRequest extends AbstractRequest {
	public String orderCode;

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	@Override
	public String getMethod() {
		return "CANCEL_WMS_ORDER";
	}
}
