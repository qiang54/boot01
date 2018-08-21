package com.example.demo01.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @WebFilter servlet3.0的注解
 *  urlPatterns：拦截路径
 *  filterName：filter名字
 */

/**
 * 注意：@ServletComponentScan 在程序入口main类上注解！！！！
 */
@WebFilter(urlPatterns = "/api/*", filterName = "loginFilter")
public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest  request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        filterChain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}
