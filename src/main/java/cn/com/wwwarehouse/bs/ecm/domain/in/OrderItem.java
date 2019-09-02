package cn.com.wwwarehouse.bs.ecm.domain.in;

import lombok.Data;

@Data
public class OrderItem {
    public String orderItemId;
    public String sellerUserId;
    public String itemId;
    public String inventoryType;
    public String itemName;
    public String productNo;
    public Long itemQty;
    public String actualPrice;
    public String itemPrice;
    public String discountFee;

    String orderSourceCode;
    String subSourceCode;
    String userId;
    String ownerUserId;
    String itemQuantity;
    String itemVersion;
    String batchRemark;
    String extendFields;

}
