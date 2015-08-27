package cn.com.iscs.apisdk.domain.in;

public class OrderItem {
	public String orderItemId;
	public String sellerUserId;
	public String itemId;
	public String inventoryType;
	public String itemName;
	public String productNo;
	public Long itemQty;
	public Double actualPrice;
	public Double itemPrice;
	public Double discountFee;
	
	String orderSourceCode;
	String subSourceCode;
	String userId;
	String ownerUserId;
	String itemQuantity;
	String itemVersion;
	String batchRemark;
	String extendFields;
	public String getOrderSourceCode() {
		return orderSourceCode;
	}

	public void setOrderSourceCode(String orderSourceCode) {
		this.orderSourceCode = orderSourceCode;
	}

	public String getSubSourceCode() {
		return subSourceCode;
	}

	public void setSubSourceCode(String subSourceCode) {
		this.subSourceCode = subSourceCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOwnerUserId() {
		return ownerUserId;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getItemVersion() {
		return itemVersion;
	}

	public void setItemVersion(String itemVersion) {
		this.itemVersion = itemVersion;
	}

	public String getBatchRemark() {
		return batchRemark;
	}

	public void setBatchRemark(String batchRemark) {
		this.batchRemark = batchRemark;
	}

	public String getExtendFields() {
		return extendFields;
	}

	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getSellerUserId() {
		return sellerUserId;
	}

	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public Long getItemQty() {
		return itemQty;
	}

	public void setItemQty(Long itemQty) {
		this.itemQty = itemQty;
	}

	public Double getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(Double actualPrice) {
		this.actualPrice = actualPrice;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Double getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(Double discountFee) {
		this.discountFee = discountFee;
	}
}
