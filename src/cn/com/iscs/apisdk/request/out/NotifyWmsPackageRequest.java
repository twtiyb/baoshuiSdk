package cn.com.iscs.apisdk.request.out;

import cn.com.iscs.apisdk.request.IscsRequest;

public class NotifyWmsPackageRequest implements IscsRequest {
	public String orderCode;
	public String tmsServiceCode;
	public String tmsOrderCode;

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getTmsServiceCode() {
		return tmsServiceCode;
	}

	public void setTmsServiceCode(String tmsServiceCode) {
		this.tmsServiceCode = tmsServiceCode;
	}

	public String getTmsOrderCode() {
		return tmsOrderCode;
	}

	public void setTmsOrderCode(String tmsOrderCode) {
		this.tmsOrderCode = tmsOrderCode;
	}

	@Override
	public String getMethod() {
		// TODO Auto-generated method stub
		return "NOTIFY_WMS_PACKAGE";
	}
}