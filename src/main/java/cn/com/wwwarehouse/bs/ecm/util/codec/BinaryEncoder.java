package cn.com.wwwarehouse.bs.ecm.util.codec;

public interface BinaryEncoder
		extends Encoder {

	public abstract byte[] encode(byte abyte0[])
			throws EncoderException;
}
