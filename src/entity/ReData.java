package entity;

import java.util.List;

/**
 * @description:
 * @author: Tong
 * @date: 2019-12-16 20:10
 */
public class ReData <T>{
    public int errorcode;
    public String errormsg;
    public Object data;

    public int getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(int errorcode) {
        this.errorcode = errorcode;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonObj{" +
                "errorcode=" + errorcode +
                ", errormsg='" + errormsg + '\'' +
                ", data=" + data +
                '}';
    }
}
