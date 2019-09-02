package cn.com.wwwarehouse.bs.swt.request;

import cn.com.wwwarehouse.bs.swt.SwtAbstractRequest;
import cn.com.wwwarehouse.bs.swt.response.IdentifyCheckResponse;
import cn.com.wwwarehouse.bs.swt.response.LogisticsInfoUploadResponse;
import lombok.Data;

/**
 * 创建者: xuchun
 * 创建时间: 2019-07-22 13:27
 * 说明:
 **/
@Data
public class LogisticsInfoUploadRequest extends SwtAbstractRequest {
    String ver;
    Integer type = 1;
    String logisticsCompany;
    String logisticsNumber;
    String payTransactionId;
    String orderNo;


    @Override
    public String getMethod() {
        return "/swt-ams/order/logisticsInfoUploa";
    }

    @Override
    public Class getResponse() {
        return LogisticsInfoUploadResponse.class;
    }
}
