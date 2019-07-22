
package cn.com.iscs.apisdk.util.codec;

public interface Encoder {

	public abstract Object encode(Object obj)
			throws EncoderException;
}
