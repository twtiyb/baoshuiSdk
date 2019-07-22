package cn.com.iscs.apisdk.test.in;

import org.junit.Assert;
import org.junit.Test;

import cn.com.iscs.apisdk.DefaultClient;
import cn.com.iscs.apisdk.IscsException;
import cn.com.iscs.apisdk.Response;
import cn.com.iscs.apisdk.request.in.CancelPurchaseOrderRequest;
import cn.com.iscs.apisdk.test.Constant;

public class CancelPurchaseOrderTest {
	@Test
	public void TestCancelPurchaseOrder() {
		CancelPurchaseOrderRequest request = new CancelPurchaseOrderRequest();
		request.setOrderCode("ZTVkMGZiYWI3NWYxYjE4MjMzNGRkMDg4NWRjYjA5ZmY=");

		DefaultClient client = new DefaultClient(Constant.URL, Constant.SERVER_USER_ID, Constant.STORE_CODE,
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
