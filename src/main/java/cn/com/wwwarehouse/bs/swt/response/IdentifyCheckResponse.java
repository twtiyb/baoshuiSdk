package cn.com.wwwarehouse.bs.swt.response;

import cn.com.wwwarehouse.bs.swt.SwtResponse;
import lombok.Data;

/**
 * 创建者: xuchun
 * 创建时间: 2019-07-22 13:46
 * 说明:
 **/
@Data
public class IdentifyCheckResponse extends SwtResponse {
	String name;
	String cid;
	String orderNo;
	String type;

	String amsCode;
	String tid;

}
