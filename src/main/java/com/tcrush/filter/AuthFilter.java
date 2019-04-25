package com.tcrush.filter;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Service
@WebFilter(urlPatterns = "/*",filterName = "authFilter")
public class AuthFilter implements FilterChain {

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) arg0;
        HttpServletResponse response = (HttpServletResponse) arg1;
        String url = request.getRequestURI();
        if (!url.endsWith("login")&& !url.endsWith("register")&&!url.endsWith("logout")) {
            //验证token
        }
        //跨域
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        response.setCharacterEncoding("UTF-8");
    }
}
