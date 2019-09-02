package cn.com.wwwarehouse.bs.ecm.test.out;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.com.wwwarehouse.bs.ecm.request.out.ReturnOrderNotifyRequest;
import cn.com.wwwarehouse.bs.ecm.util.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import cn.com.wwwarehouse.bs.ecm.DefaultClient;
import cn.com.wwwarehouse.bs.ecm.IscsException;
import cn.com.wwwarehouse.bs.ecm.Response;
import cn.com.wwwarehouse.bs.ecm.domain.in.OrderItem;
import cn.com.wwwarehouse.bs.ecm.test.Constant;
import cn.com.wwwarehouse.bs.ecm.util.AuthUtil;

public class ReturnOrderNotifyTest {
	@Test
	public void TestReturnOrderNotify() {
		ReturnOrderNotifyRequest request = new ReturnOrderNotifyRequest();
		//订单信息
		request.setStoreCode(Constant.STORE_CODE);
		request.setSellerUserId(Constant.SUB_SERVER_USER_ID);
//		request.setOrderCode(AuthUtil.sign(StringUtil.formatDate(new Date()).trim()+Math.random()*100));
		request.setOrderCode(AuthUtil.sign(StringUtil.formatDate(new Date()).trim() + Math.random() * 100).substring(0, 10));
		request.setOrderCreateTime(new Date());

		//配送信息
		request.setTmsServiceCode("EMS"); //需要向网仓申请。

		//收货人地址
		request.setReceiverAddress("dddd");
		request.setReceiverArea("江干区");
		request.setReceiverCity("杭州市");
		request.setReceiverProvince("浙江省");
		request.setReceiverName("徐天");
		request.setReceiverZipCode("456400");
		request.setReceiverPhone("1332323232");

		//商品信息
		OrderItem item = new OrderItem();
		item.setInventoryType("1");
		item.setItemId("skuId1");
		item.setProductNo("productCode1");
		item.setItemQty(1L);
		item.setOrderItemId(item.getProductNo());
		item.setSellerUserId(request.getSellerUserId());

		OrderItem item2 = new OrderItem();
		item2.setInventoryType("1");
		item2.setItemId("skuId2");
		item2.setProductNo("productCode2");
		item2.setItemQty(1L);
		item2.setOrderItemId(item2.getProductNo());
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
