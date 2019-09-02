package cn.com.wwwarehouse.bs.ecm.internal.parser;

import cn.com.wwwarehouse.bs.ecm.IscsException;
import cn.com.wwwarehouse.bs.ecm.Response;

import java.util.Map;

public interface Parser {

	public abstract Response parse(String s, Class class1)
			throws IscsException;

	public abstract String writeValueAsString(Object object);

	public abstract Map<String, String> writeVaueAsMap(Object object);
}
