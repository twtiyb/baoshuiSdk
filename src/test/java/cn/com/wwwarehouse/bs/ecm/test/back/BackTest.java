package cn.com.wwwarehouse.bs.ecm.test.back;

import cn.com.wwwarehouse.bs.ecm.request.base.SubscriptionNotifyRequest;
import org.junit.Assert;
import org.junit.Test;

import cn.com.wwwarehouse.bs.ecm.DefaultClient;
import cn.com.wwwarehouse.bs.ecm.IscsException;
import cn.com.wwwarehouse.bs.ecm.Response;
import cn.com.wwwarehouse.bs.ecm.test.Constant;

public class BackTest {
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
