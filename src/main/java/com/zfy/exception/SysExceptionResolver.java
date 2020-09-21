package com.zfy.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        SysException ex = null;
        if(e instanceof SysException) {
            ex = (SysException) e;
        }else{
            ex = new SysException("系统异常，请联系管理员。", e);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("errMsg", ex.getClientMessage());
        return modelAndView;
    }
}
