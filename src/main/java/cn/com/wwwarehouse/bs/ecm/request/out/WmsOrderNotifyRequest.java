package cn.com.wwwarehouse.bs.ecm.request.out;

import cn.com.wwwarehouse.bs.ecm.domain.in.OrderItem;
import cn.com.wwwarehouse.bs.ecm.domain.out.InvoiceInfo;
import cn.com.wwwarehouse.bs.ecm.request.AbstractRequest;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class WmsOrderNotifyRequest extends AbstractRequest {
    public String businessType;


    public String storeCode;
    public String sellerUserId;
    public String orderCode;
    public Date orderCreateTime;

    public String customsReleaseMethod;


    //收货信息
    public String receiverZipCode;
    public String receiverProvince;
    public String receiverCity;
    public String receiverCounty;
    public String receiverAddress;
    public String receiverName;
    public String receiverMobile;
    public String receiverPhone;
    public String remark;

    //支付信息
    public String orderTaxAmount;
    public String insureAmount;
    public String payCompanyCode;
    public String payCompanyName;
    public String payNumber;
    public String payType;
    public String payment;
    public String totalFee;
    public String discountFee;
    public Date orderPayTime;

    //清关信息
    public String paperType;
    public String paperNumber;
    public String telNumber;
    public String name;
    public String purchaserId;


    //快递信息
    public String postFee;
    public String tmsServiceCode;
    public String tmsOrderCode;


    List<InvoiceInfo> invoiceInfoList;
    List<OrderItem> orderItemList;


    @Override
    public String getMethod() {
        return "WMS_ORDER_NOTIFY";
    }
}
