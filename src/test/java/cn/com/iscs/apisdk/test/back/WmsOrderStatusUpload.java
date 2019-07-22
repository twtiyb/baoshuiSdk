package cn.com.iscs.apisdk.test.back;

import org.junit.Assert;
import org.junit.Test;

import cn.com.iscs.apisdk.DefaultClient;
import cn.com.iscs.apisdk.IscsException;
import cn.com.iscs.apisdk.Response;
import cn.com.iscs.apisdk.request.base.SubscriptionNotifyRequest;
import cn.com.iscs.apisdk.test.Constant;

public class WmsOrderStatusUpload {
	@Test
	public void TestBack() {
		SubscriptionNotifyRequest request = new SubscriptionNotifyRequest();
		request.setActionType("ADD");
		request.setSellerUserId("xuchunApiTest");
		request.setStoreCode("YIZHI");
		request.setSellerNick("xuchun API 测试");
		DefaultClient client = new DefaultClient(Constant.BACK_URL, Constant.SERVER_USER_ID, Constant.STORE_CODE,
				Constant.PLATFORM_ID, Constant.KEY, Constant.FORMAT);
		try {
			Response response = client.execute(request);
			Assert.assertEquals("true", response.getSuccess());
		} catch (IscsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
