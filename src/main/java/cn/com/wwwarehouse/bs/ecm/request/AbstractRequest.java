package cn.com.wwwarehouse.bs.ecm.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class AbstractRequest {
	@JsonIgnore
	public abstract String getMethod();
}
