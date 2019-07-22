package cn.com.iscs.apisdk.test.in;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import cn.com.iscs.apisdk.DefaultClient;
import cn.com.iscs.apisdk.IscsException;
import cn.com.iscs.apisdk.Response;
import cn.com.iscs.apisdk.domain.in.OrderItem;
import cn.com.iscs.apisdk.request.in.PurchaseOrderNotifyRequest;
import cn.com.iscs.apisdk.test.Constant;
import cn.com.iscs.apisdk.util.StringUtil;

public class PurchaseOrderNotifyTest {
	@Test
	public void TestPurchaseOrderNotify() {
		PurchaseOrderNotifyRequest request = new PurchaseOrderNotifyRequest();
		//订单信息
		request.setStoreCode(Constant.STORE_CODE);
		request.setSellerUserId(Constant.SUB_SERVER_USER_ID);
		request.setOrderCode(StringUtil.formatDate(new Date()).trim());
		request.setOrderType("601");
		request.setOrderCreateTime(new Date());

		//配送信息   
		request.setTmsServiceCode("ZTO"); //需要向网仓申请。
		request.setTmsOrderCode(StringUtil.formatDate(new Date()).trim());

		//计划信息
		request.setExpectEndTime(new Date());
		request.setExpectStartTime(new Date());

		//收货人信息(可选填，直接写死成仓库地址)
		request.setReceiverName("xuchun");
		request.setReceiverMobile("18033333242");

		//商品信息
		OrderItem item = new OrderItem();
		item.setInventoryType("1");
		item.setItemId("skuId1");
		item.setProductNo("productCode1");
		item.setItemQty(1L);
		item.setSellerUserId(request.getSellerUserId());

		OrderItem item2 = new OrderItem();
		item2.setInventoryType("1");
		item2.setItemId("skuId2");
		item2.setProductNo("productCode2");
		item2.setItemQty(1L);
		item2.setSellerUserId(request.getSellerUserId());

		List<OrderItem> itemList = new ArrayList<OrderItem>();
		itemList.add(item);
		itemList.add(item2);
		request.setOrderItemList(itemList);

		DefaultClient client = new DefaultClient(Constant.URL, Constant.SERVER_USER_ID
				, Constant.STORE_CODE, Constant.PLATFORM_ID, Constant.KEY, Constant.FORMAT);
		try {
			Response response = client.execute(request);
			Assert.assertEquals("true", response.getSuccess());
		} catch (IscsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
