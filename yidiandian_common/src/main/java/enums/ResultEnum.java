package enums;

/**
 * @Author: 一点点
 * @Date: 2019/5/18 10:49
 * @Version 1.0
 */

public enum ResultEnum {
    SUCCESS(200,"成功"),
    FAIL(100,"失败"),
    EXCEPTION(300,"系统异常"),
    PARAMS_IS_NULL(204,"参数缺失"),
    UNLOGIN(201,"未登陆");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
