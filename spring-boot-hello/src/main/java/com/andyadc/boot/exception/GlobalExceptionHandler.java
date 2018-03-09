package com.andyadc.boot.exception;

import com.andyadc.boot.dto.ResponseInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author andy.an
 * @since 2018/1/3
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = PageException.class)
    public ModelAndView pageExceptionHandler(HttpServletRequest request, PageException ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", ex);
        mv.addObject("url", request.getRequestURL().toString());
        mv.setViewName("page");
        LOG.error("pageExceptionHandler resp: {}", mv);
        return mv;
    }

    @ResponseBody
    @ExceptionHandler(value = JsonException.class)
    public ResponseInfo<?> jsonExceptionHandler(HttpServletRequest request, JsonException ex) {
        ResponseInfo<String> info = new ResponseInfo<>();
        info.setCode(ex.getErrorCode());
        info.setMessage(ex.getErrorMessage());
        info.setData(request.getRequestURL().toString());
        LOG.error("jsonExceptionHandler resp: {}", info);
        return info;
    }
}
