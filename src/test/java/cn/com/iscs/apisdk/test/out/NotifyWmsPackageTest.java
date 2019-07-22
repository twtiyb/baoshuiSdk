package cn.com.iscs.apisdk.test.out;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import cn.com.iscs.apisdk.DefaultClient;
import cn.com.iscs.apisdk.IscsException;
import cn.com.iscs.apisdk.Response;
import cn.com.iscs.apisdk.request.out.NotifyWmsPackageRequest;
import cn.com.iscs.apisdk.test.Constant;
import cn.com.iscs.apisdk.util.AuthUtil;
import cn.com.iscs.apisdk.util.StringUtil;

public class NotifyWmsPackageTest {
	@Test
	public void TestNotifyWmsPackage() {
		NotifyWmsPackageRequest request = new NotifyWmsPackageRequest();
		// 配送信息
		request.setOrderCode("ZTFjYzMxNj");
//		request.setTmsServiceCode("ZTO"); // 需要向网仓申请。
//		String sss = "http://img01.taobaocdn.com/tfscom/TB1fE46JXXXXXXXXpXXSutbFXXX";
//		request.setTmsOrderCode(AuthUtil.sign(StringUtil.formatDate(new Date()).trim()+Math.random()*100).substring(0,30));
//		request.setTmsOrderCode("359356017755");
//		request.setPrintFileUrl(sss);

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
