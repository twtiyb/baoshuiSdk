
package cn.com.wwwarehouse.bs.ecm.util.codec;

public interface Encoder {

	public abstract Object encode(Object obj)
			throws EncoderException;
}
