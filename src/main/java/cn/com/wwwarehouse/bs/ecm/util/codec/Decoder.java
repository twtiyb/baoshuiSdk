
package cn.com.wwwarehouse.bs.ecm.util.codec;

public interface Decoder {

	public abstract Object decode(Object obj)
			throws DecoderException;
}
