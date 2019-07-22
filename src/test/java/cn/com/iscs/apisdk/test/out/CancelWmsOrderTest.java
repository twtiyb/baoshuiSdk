package cn.com.iscs.apisdk.test.out;

import org.junit.Assert;
import org.junit.Test;

import cn.com.iscs.apisdk.DefaultClient;
import cn.com.iscs.apisdk.IscsException;
import cn.com.iscs.apisdk.Response;
import cn.com.iscs.apisdk.request.out.CancelWmsOrderRequest;
import cn.com.iscs.apisdk.test.Constant;

public class CancelWmsOrderTest {
	@Test
	public void TestCancelWmsOrder() {
		CancelWmsOrderRequest request = new CancelWmsOrderRequest();
		request.setOrderCode("98");

		DefaultClient client = new DefaultClient(Constant.URL, Constant.SERVER_USER_ID, Constant.STORE_CODE,
				Constant.PLATFORM_ID, Constant.KEY, Constant.FORMAT);
		try {
			Response response = client.execute(request);
			Assert.assertEquals("true", response.getSuccess());
		} catch (IscsException e) {
			e.printStackTrace();
		}
	}

}
