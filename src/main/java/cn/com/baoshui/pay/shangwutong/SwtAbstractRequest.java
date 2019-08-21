package cn.com.baoshui.pay.shangwutong;

import cn.com.iscs.apisdk.request.AbstractRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * 创建者: xuchun
 * 创建时间: 2019-07-22 13:34
 * 说明:
 **/
@Data
public abstract class SwtAbstractRequest extends AbstractRequest {
	public String ebpCode;
	public String ebpName;

	@JsonIgnore
	public abstract Class getResponse();
}
