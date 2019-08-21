package cn.com.iscs.apisdk.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class AbstractRequest {
	@JsonIgnore
	public abstract String getMethod();
}
