package cn.com.iscs.apisdk.request.out;

import cn.com.iscs.apisdk.domain.in.OrderItem;
import cn.com.iscs.apisdk.domain.out.InvoiceInfo;
import cn.com.iscs.apisdk.request.IscsRequest;

import java.util.Date;
import java.util.List;

public class WmsOrderNotifyRequest implements IscsRequest {
	public String storeCode;
	public String sellerUserId;
	public String orderCode;
	public Date orderCreateTime;
	public Date orderPayTime;
	public Double totalFee;
	public Double payment;
	public Double discountFee;
	public Double postFee;
	public String tmsServiceCode;
	public String tmsOrderCode;
	public String customsReleaseMethod;
	public String receiverZipCode;
	public String receiverProvince;
	public String receiverCity;
	public String receiverCounty;
	public String receiverAddress;
	public String receiverName;
	public String receiverMobile;
	public String receiverPhone;
	List<InvoiceInfo> invoiceInfoList;
	List<OrderItem> orderItemList;

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getSellerUserId() {
		return sellerUserId;
	}

	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Date getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderPayTime() {
		return orderPayTime;
	}

	public void setOrderPayTime(Date orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public Double getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(Double discountFee) {
		this.discountFee = discountFee;
	}

	public Double getPostFee() {
		return postFee;
	}

	public void setPostFee(Double postFee) {
		this.postFee = postFee;
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

	public String getReceiverZipCode() {
		return receiverZipCode;
	}

	public void setReceiverZipCode(String receiverZipCode) {
		this.receiverZipCode = receiverZipCode;
	}

	public String getReceiverProvince() {
		return receiverProvince;
	}

	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}

	public String getReceiverCity() {
		return receiverCity;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverCounty() {
		return receiverCounty;
	}

	public void setReceiverCounty(String receiverCounty) {
		this.receiverCounty = receiverCounty;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverMobile() {
		return receiverMobile;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public List<InvoiceInfo> getInvoiceInfoList() {
		return invoiceInfoList;
	}

	public void setInvoiceInfoList(List<InvoiceInfo> invoiceInfoList) {
		this.invoiceInfoList = invoiceInfoList;
	}

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public String getCustomsReleaseMethod() {
		return customsReleaseMethod;
	}

	public void setCustomsReleaseMethod(String customsReleaseMethod) {
		this.customsReleaseMethod = customsReleaseMethod;
	}

	@Override
	public String getMethod() {
		// TODO Auto-generated method stub
		return "WMS_ORDER_NOTIFY";
	}
}
