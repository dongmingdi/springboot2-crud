package com.dongmingdi.springboot.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if(user == null) {
            request.setAttribute("msg", "没有权限 清先登陆");
            request.getRequestDispatcher("index.html").forward(request, response);
            return false;
        } else {
            return true;
        }
    }
}
