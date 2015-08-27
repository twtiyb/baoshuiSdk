package cn.com.iscs.apisdk.request.out;

import cn.com.iscs.apisdk.request.IscsRequest;

public class CancelWmsOrderRequest implements IscsRequest {
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
