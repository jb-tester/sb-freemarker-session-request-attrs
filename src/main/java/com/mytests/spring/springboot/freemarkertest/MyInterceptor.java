package com.mytests.spring.springboot.freemarkertest;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class MyInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler)
            throws Exception {

        long startTime = System.currentTimeMillis();
        request.setAttribute("start_reqattr1", startTime);
        request.setAttribute("start_reqattr2", startTime);
        request.setAttribute("start_reqattr3", startTime);
        request.getSession().setAttribute("globalSessionAttr1", "globalSA1");
        request.getSession().setAttribute("globalSessionAttr2", "globalSA2");
        request.getSession().setAttribute("globalSessionAttr3", "globalSA3");
        //request.getSession().setAttribute("globalSessionAttr4", "globalSA4");
        //request.getSession().setAttribute("globalSessionAttr5", "globalSA5");
        return true;
    }

    //after the handler is executed
    public void postHandle(
            HttpServletRequest request, HttpServletResponse response,
            Object handler, ModelAndView modelAndView)
            throws Exception {

        long startTime = (Long) request.getAttribute("start_reqattr1");

        long endTime = System.currentTimeMillis();

        long executeTime = endTime - startTime;


        modelAndView.addObject("duration", executeTime);

    }
}
