package cn.com.wwwarehouse.bs.ecm.test.in;

import cn.com.wwwarehouse.bs.ecm.request.in.CancelPurchaseOrderRequest;
import org.junit.Assert;
import org.junit.Test;

import cn.com.wwwarehouse.bs.ecm.DefaultClient;
import cn.com.wwwarehouse.bs.ecm.IscsException;
import cn.com.wwwarehouse.bs.ecm.Response;
import cn.com.wwwarehouse.bs.ecm.test.Constant;

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
