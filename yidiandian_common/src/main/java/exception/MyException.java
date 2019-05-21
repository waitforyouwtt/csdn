package exception;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: 一点点
 * @Date: 2019/5/18 10:53
 * @Version 1.0
 */

@Data
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(String msg){
        super(msg);
    }
    public MyException(Integer code, String msg){
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
