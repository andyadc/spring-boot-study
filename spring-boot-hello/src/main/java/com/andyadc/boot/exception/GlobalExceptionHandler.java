package com.andyadc.boot.exception;

import com.andyadc.boot.dto.ResponseInfo;
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

    @ExceptionHandler(value = PageException.class)
    public ModelAndView pageExceptionHandler(HttpServletRequest request, PageException ex) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", ex);
        mv.addObject("url", request.getRequestURL().toString());
        mv.setViewName("error");
        return mv;
    }

    @ResponseBody
    @ExceptionHandler(value = JsonException.class)
    public ResponseInfo<String> jsonExceptionHandler(HttpServletRequest request, JsonException ex) throws Exception {
        ResponseInfo<String> info = new ResponseInfo<>();
        info.setCode("505");
        info.setMessage("some wrong");
        info.setData(request.getRequestURL().toString());
        return info;
    }
}
