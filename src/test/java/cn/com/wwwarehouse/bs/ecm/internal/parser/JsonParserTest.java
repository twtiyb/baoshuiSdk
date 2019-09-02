package cn.com.wwwarehouse.bs.ecm.internal.parser;

import cn.com.wwwarehouse.bs.swt.request.CreatePayOrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * 创建者: xuchun
 * 创建时间: 2019-07-22 11:39
 * 说明:
 **/
@Slf4j

public class JsonParserTest {

	@Test
	public void parse() {
	}

	@Test
	public void writeValueAsString() {
	}

	@Test
	public void writeVaueAsMap() {
		Parser jsonParser = ParserFactory.getJsonParser();
		CreatePayOrderRequest order = new CreatePayOrderRequest();
		order.setOrderNo("aaa");
		Map mapData = jsonParser.writeVaueAsMap(order);
		log.info(jsonParser.writeValueAsString(mapData));

		Assert.assertTrue(jsonParser.writeValueAsString(mapData).equals(jsonParser.writeValueAsString(order)));

	}
}