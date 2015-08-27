package cn.com.iscs.apisdk.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IscsRequest {
	@JsonIgnore
	String getMethod();
}
