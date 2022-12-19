package com.pjy.simplewarehouse.common.error;

import com.pjy.simplewarehouse.common.api.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 功能描述
 *
 * @author: PJY
 * @date: 2022年12月17日 18:00
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger=LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = ApiException.class)
    @ResponseBody
    public R ApiExceptionHandler(HttpServletRequest req, ApiException e){
        logger.warn("发生异常:{}",e.getMessage());
        e.printStackTrace();
        return R.error(e.getErrorCode());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public R ApiExceptionHandler(HttpServletRequest req, Exception e){
        logger.warn("未知异常:{}",e.getMessage());
        e.printStackTrace();
        return R.error(ErrorCode.ERROR_HAPPEND);
    }

}
