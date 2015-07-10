package cn.com.iscs.apisdk.util.codec;

public interface BinaryEncoder
        extends Encoder {

    public abstract byte[] encode(byte abyte0[])
            throws EncoderException;
}
