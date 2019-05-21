package entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @Author: 一点点
 * @Date: 2019/5/18 10:45
 * @Version 1.0
 */
@Data
@ToString
public class Result {
    //是否成功
    private boolean flag;
    //返回code
    private Integer  code;
    //返回提示信息
    private String   message;
    //返回数据
    private Object   data;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
