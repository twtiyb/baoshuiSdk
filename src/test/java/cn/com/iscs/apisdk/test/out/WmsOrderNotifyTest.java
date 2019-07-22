package cn.com.iscs.apisdk.test.out;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import cn.com.iscs.apisdk.DefaultClient;
import cn.com.iscs.apisdk.IscsException;
import cn.com.iscs.apisdk.Response;
import cn.com.iscs.apisdk.domain.in.OrderItem;
import cn.com.iscs.apisdk.domain.out.InvoiceInfo;
import cn.com.iscs.apisdk.request.out.WmsOrderNotifyRequest;
import cn.com.iscs.apisdk.test.Constant;
import cn.com.iscs.apisdk.util.AuthUtil;
import cn.com.iscs.apisdk.util.StringUtil;

public class WmsOrderNotifyTest {
	@Test
	public void TestWmsOrderNotify() {
		WmsOrderNotifyRequest request = new WmsOrderNotifyRequest();
		//订单信息
		request.setStoreCode(Constant.STORE_CODE);
		request.setSellerUserId(Constant.SUB_SERVER_USER_ID);
//		request.setOrderCode(AuthUtil.sign(StringUtil.formatDate(new Date()).trim()+Math.random()*100));
		request.setOrderCode(AuthUtil.sign(StringUtil.formatDate(new Date()).trim() + Math.random() * 100).substring(0, 10));

		request.setOrderCreateTime(new Date());

		//配送信息   
		request.setTmsServiceCode("EMS"); //需要向网仓申请。
//		request.setTmsOrderCode(StringUtil.formatDate(new Date()).trim());


		//收货人信息(可选填，直接写死成仓库地址)
		request.setReceiverName("xuchun");
		request.setReceiverMobile("18033333242");
		request.setReceiverProvince("浙江省");
		request.setReceiverCity("杭州市");
		request.setReceiverCounty("江干区");
		request.setReceiverAddress("下沙保税仓库");


		//发票信息(可选)
		InvoiceInfo info = new InvoiceInfo();
		info.setBillAccount("1");
		info.setBillContent("1");
		info.setBillTitle("xuchun Test");
		info.setBillType("T");
		List<InvoiceInfo> infoList = new ArrayList<InvoiceInfo>();
		infoList.add(info);
		request.setInvoiceInfoList(infoList);

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
