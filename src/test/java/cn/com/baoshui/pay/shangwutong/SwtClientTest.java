package cn.com.baoshui.pay.shangwutong;

import cn.com.baoshui.pay.shangwutong.request.CreatePayOrderRequest;
import cn.com.baoshui.pay.shangwutong.request.IdentifyCheckRequest;
import cn.com.baoshui.pay.shangwutong.response.CreatePayOrderResponse;
import cn.com.baoshui.pay.shangwutong.response.IdentifyCheckResponse;
import cn.com.iscs.apisdk.IscsException;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Date;
import java.util.Map;

/**
 * 创建者: xuchun
 * 创建时间: 2019-07-22 13:22
 * 说明:
 **/
@Slf4j
public class SwtClientTest {

	@Test
	public void execute() {
		SwtClient client = new SwtClient("http://59.41.60.158:8088", "0000002378", "2AFCB468A04146C0A89A2486D94025EF");

		IdentifyCheckRequest request = new IdentifyCheckRequest();
		request.setVer("V2.1.5");
		request.setName("张三");
		request.setCid("123456199001011233");
		request.setOrderNo("abcd234");

		try {
			IdentifyCheckResponse res = (IdentifyCheckResponse) client.execute(request);
		} catch (IscsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void execute2() {
		SwtClient client = new SwtClient("http://59.41.60.158:8088", "0000002378", "2AFCB468A04146C0A89A2486D94025EF");

		CreatePayOrderRequest request = new CreatePayOrderRequest();
		request.setEbpCode("C011111100397111");
		request.setEbpName("自动化测试01");
		request.setVer("V2.1.5");

		request.setOrderNo("abcd234");
		request.setCustomsType("10");
//		request.setBatchNo("111111111");
		request.setPayTransactionId(RandomUtil.randomString(40));
		request.setPayerIdNumber("123456199001011233");
		request.setPayerName("张三");
		request.setTelephone("180572028202");
		request.setAmountPaid(500L);
		request.setPayTime(DateUtil.format(new Date(), "yyyyMMddhhmmss"));

		try {
			CreatePayOrderResponse res = (CreatePayOrderResponse) client.execute(request);
		} catch (IscsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getToken() {
		Map map = JSONUtil.parseObj("{\n" +
				"  \"amountPaid\": \"5\",\n" +
				"  \"ebpCode\": \"C011111100397111\",\n" +
				"  \"ebpName\": \"自动化测试01\",\n" +
				"  \"mchtId\": \"0000002378\",\n" +
				"  \"orderNo\": \"BBCEE190618009\",\n" +
				"  \"payTime\": \"20190619150124\",\n" +
				"  \"payTransactionId\": \"2019061920000012124461431548364\",\n" +
				"  \"payerIdNumber\": \"123456199001011233\",\n" +
				"  \"payerName\": \"张三\",\n" +
				"  \"returnInfo\": \"支付单新增申报成功[87DB3A83-743A-4905-9841-56FD3FF67CCC]\",\n" +
				"  \"returnStatus\": \"2\",\n" +
				"  \"telephone\": \"13557115730\"\n" +
				"}");

		SwtClient.getSign(map, "2AFCB468A04146C0A89A2486D94025EF");
		log.info("原sign--->{}", "351302bff428690175b9a2deec8796cc");
	}
}