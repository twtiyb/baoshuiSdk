package cn.com.wwwarehouse.bs.ecm.test.out;

import cn.com.wwwarehouse.bs.ecm.request.out.CancelWmsOrderRequest;
import org.junit.Assert;
import org.junit.Test;

import cn.com.wwwarehouse.bs.ecm.DefaultClient;
import cn.com.wwwarehouse.bs.ecm.IscsException;
import cn.com.wwwarehouse.bs.ecm.Response;
import cn.com.wwwarehouse.bs.ecm.test.Constant;

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
