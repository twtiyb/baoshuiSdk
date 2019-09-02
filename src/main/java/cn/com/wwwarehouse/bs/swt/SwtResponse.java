package cn.com.wwwarehouse.bs.swt;

import lombok.Data;

/**
 * 创建者: xuchun
 * 创建时间: 2019-07-22 13:42
 * 说明:
 **/
@Data
public class SwtResponse {
	String code;
	String msg;
	String token;
	String sign;
}
