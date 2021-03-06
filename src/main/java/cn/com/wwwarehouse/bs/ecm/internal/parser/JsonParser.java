package cn.com.wwwarehouse.bs.ecm.internal.parser;

import cn.com.wwwarehouse.bs.ecm.IscsException;
import cn.com.wwwarehouse.bs.ecm.Response;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.Map;

public class JsonParser implements Parser {

	private ObjectMapper mapper = new ObjectMapper();

	public JsonParser() {
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
	}

	public Response parse(String json, Class responseClass) throws IscsException {
		Response response = null;
		try {
			response = (Response) mapper.readValue(json, responseClass);
		} catch (Exception e) {
			throw new IscsException(e);
		}
		return response;
	}

	public String writeValueAsString(Object obj) {
		String value = null;
		try {
			value = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
		}
		return value;
	}

	@Override
	public Map<String, String> writeVaueAsMap(Object object) {
		return mapper.convertValue(object, Map.class);
	}

}
