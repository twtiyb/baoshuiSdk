package cn.com.wwwarehouse.bs.swt.request;

import cn.com.wwwarehouse.bs.swt.SwtAbstractRequest;
import cn.com.wwwarehouse.bs.swt.response.CreatePayOrderResponse;
import lombok.Data;

/**
 * 创建者: xuchun
 * 创建时间: 2019-07-22 11:10
 * 说明:
 **/
@Data
public class CreatePayOrderRequest extends SwtAbstractRequest {

	String ver;
	String batchNo;
	String customsType;
	String payTransactionId;
	String orderNo;
	String ebpCode;
	String ebpName;
	String payerIdNumber;
	String payerName;
	String telephone;
	Long amountPaid;
	String payTime;
	String note;

    String commodityName;
    String commodityDetails;

	//非必填
	String cbeCode;
	String intype;
	String reciptCode;

	@Override
	public String getMethod() {
		return "/swt-ams/order/orderRecord";
	}

	@Override
	public Class getResponse() {
		return CreatePayOrderResponse.class;
	}
}
