package cn.com.iscs.apisdk.util.codec;

public interface BinaryDecoder extends Decoder {

	public abstract byte[] decode(byte abyte0[]) throws DecoderException;
}
