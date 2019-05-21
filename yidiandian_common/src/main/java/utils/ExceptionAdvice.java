package utils;

import entity.Result;
import enums.ResultEnum;
import exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: 一点点
 * @Date: 2019/5/18 10:55
 * @Version 1.0
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defaultException(HttpServletRequest request, Exception e){
        e.printStackTrace();
        Result result = new Result();
        result.setFlag(false);
        result.setCode(ResultEnum.EXCEPTION.getCode());
        result.setMessage(ResultEnum.EXCEPTION.getMsg());
        result.setData(null);
        return result;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Result myException(HttpServletRequest request, MyException e){
        e.printStackTrace();
        Integer code = e.getCode();
        String msg = e.getMessage();
        if (e.getCode() == null){
            code = ResultEnum.EXCEPTION.getCode();
        }
        if (e.getMessage() == null){
            msg = ResultEnum.EXCEPTION.getMsg();
        }
        Result result = new Result();
        result.setFlag(false);
        result.setCode(code);
        result.setMessage(msg);
        result.setData(null);
        return result;
    }
}