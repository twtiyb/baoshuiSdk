
package cn.com.iscs.apisdk.internal.parser;

import cn.com.iscs.apisdk.IscsException;
import cn.com.iscs.apisdk.Response;

public interface Parser {

    public abstract  Response parse(String s, Class class1)
            throws IscsException;

	public abstract String writeValueAsString(Object object);
}
